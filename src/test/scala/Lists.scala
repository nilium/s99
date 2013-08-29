import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite

class ListsSuite extends FunSuite with ShouldMatchers with net.spifftastic.problems.ListProblems {
  /*============================================================================
    All list functions are defined using generics. This is to -- hopefully --
    help you focus on the problem at hand without worrying about the types as
    much, though you're welcome to try to change that for any problem.

    In addition, in order for the use of `pending` to work, I've omitted the
    return type for all functions. You can add them back in as you like, since
    it's good practice and the compiler will help you not screw up in solving
    the problems.
  ============================================================================*/


  test("P01 (*)  Find the last element of a list") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      last(inputList) should equal (8)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P02 (*)  Find the last but one element of a list") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      penultimate(inputList) should equal (5)
    } catch {
      case nie: NotImplementedError => pending
    }
  }

  test("P03 (*)  Find the Kth element of a list") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      nth(2, inputList) should equal (2)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P04 (*)  Find the number of elements of a list") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      length(inputList) should equal (6)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P05 (*)  Reverse a list") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      val outputList = List(8, 5, 3, 2, 1, 1)
      reverse(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P06 (*)  Find whether a list is a palindrome") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      val palindromeInputList = List(1, 2, 3, 2, 1)

      isPalindrome(inputList) should equal (false)
      isPalindrome(palindromeInputList) should equal (true)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P07 (**) Flatten a nested list structure") {
    try {
      val inputList = List(1, 1, 2, 3, 5, 8)
      val nestedList = List(List(1, 1), 2, List(3, List(5, 8)))

      flatten(inputList) should equal (inputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P08 (**) Eliminate consecutive duplicates of list elements") {
    try {
      val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val outputList = List('a, 'b, 'c, 'a, 'd, 'e)
      compress(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P09 (**) Pack consecutive duplicates of list elements into sublists") {
    try {
      val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val outputList = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
      pack(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P10 (*)  Run-length encoding of a list") {
    try {
      val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val outputList = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      encode(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P11 (*)  Modified run-length encoding") {
    try {
      val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val outputList = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
      encodeModified(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P12 (**) Decode a run-length encoded list") {
    try {
      val encodedInputList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val outputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      decode(encodedInputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P13 (**) Run-length encoding of a list (direct)") {
    try {
      val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val outputList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      encodeDirect(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P14 (*)  Duplicate the elements of a list") {
    try {
      val inputList = List('a, 'b, 'c, 'c, 'd)
      val outputList = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
      duplicate(inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P15 (**) Duplicate the elements of a list a given number of times") {
    try {
      val inputList = List('a, 'b, 'c, 'c, 'd)
      val outputList = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      duplicateN(3, inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P16 (**) Duplicate the elements of a list a given number of times") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      val outputList = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      drop(3, inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P17 (*)  Split a list into two parts") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      val outputTuple = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      split(3, inputList) should equal (outputTuple)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P18 (**) Extract a slice from a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      val outputList = List('d, 'e, 'f, 'g)
      slice(3, 7, inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P19 (**) Rotate a list N places to the left") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

      val outputList1 = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
      rotate(3, inputList) should equal (outputList1)

      val outputList2 = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
      rotate(-2, inputList) should equal (outputList2)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P20 (*)  Remove the Kth element from a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd)
      val outputTuple = (List('a, 'c, 'd), 'b)
      removeAt(1, inputList) should equal (outputTuple)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P21 (*)  Insert an element at a given position into a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd)
      val outputList = List('a, 'new, 'b, 'c, 'd)
      insertAt('new, 1, inputList) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P22 (*)  Create a list containing all integers within a given range (inclusive)") {
    try {
      val outputList = List(4, 5, 6, 7, 8, 9)
      integersInRange(4, 9) should equal (outputList)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P23 (**) Extract a given number of randomly selected elements from a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
      val outputList = randomSelect(3, inputList)

      /* The method for testing this is borrowed from Eric Torreborre's Scala 99
      problems tests. <https://github.com/etorreborre/s99> */

      outputList should have size (3)
      outputList.distinct should have size (outputList.size)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P24 (*)  Draw N different numbers from the set 1..M") {
    try {
      val outputRange = 1 to 49
      val outputList = lotto(6, 49)

      outputList should have size (6)
      outputList foreach (outputRange should contain (_))
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P25 (**) Generate a random permutation of the elements of a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
      val outputList = randomPermute(inputList)

      /* The method for testing this is borrowed from Eric Torreborre's Scala 99
      problems tests. <https://github.com/etorreborre/s99> */

      outputList should have size (6)
      outputList.distinct should have size (outputList.size)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list") {
    try {
      val inputList = List('a, 'b, 'c, 'd, 'e, 'f)
      val expectedListContents = Set(
        List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e),
        List('a, 'b, 'f), List('a, 'c, 'd), List('a, 'c, 'e),
        List('a, 'c, 'f), List('a, 'd, 'e), List('a, 'd, 'f),
        List('a, 'e, 'f), List('b, 'c, 'd), List('b, 'c, 'e),
        List('b, 'c, 'f), List('b, 'd, 'e), List('b, 'd, 'f),
        List('b, 'e, 'f), List('c, 'd, 'e), List('c, 'd, 'f),
        List('c, 'e, 'f), List('d, 'e, 'f))

      val outputList = combination(inputList)

      /* The method for testing this is borrowed from Eric Torreborre's Scala 99
      problems tests. <https://github.com/etorreborre/s99> */

      outputList should have size (expectedListContents.size)
      expectedListContents foreach { x => outputList should(contain(x)) }
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P27 (**) Generate the combinations of K distinct objects chosen from the N elements of a list (A)") {
    try {
      val inputList = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
      val outputList = group3(inputList)
      val expectedEntry = List(List("Aldo", "Beat"), List("Carla", "David", "Evi"), List("Flip", "Gary", "Hugo", "Ida"))

      /* The method for testing this is borrowed from Eric Torreborre's Scala 99
        problems tests. <https://github.com/etorreborre/s99>

        TODO: Generate reference results for comparison.
      */

      outputList should contain(expectedEntry)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P27 (**) Generate the combinations of K distinct objects chosen from the N elements of a list (B)") {
    try {
      val inputList = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
      val outputList = group(List(2, 2, 5), inputList)
      val expectedEntry = List(List("Aldo", "Beat"), List("Carla", "David"), List("Evi", "Flip", "Gary", "Hugo", "Ida"))

      /* The method for testing this is borrowed from Eric Torreborre's Scala 99
        problems tests. <https://github.com/etorreborre/s99>

        TODO: Generate reference results for comparison.
      */

      outputList should contain(expectedEntry)
    } catch {
      case nie: NotImplementedError => pending
    }
  }


  test("P28 (**) Sorting a list of lists according to length of sublists.") (pending)

}
