import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite

class ListsSuite extends FunSuite with ShouldMatchers {
  /**
   * Throws an exception to report that the test has not been filled out yet.
   * This allows you to distinguish between tests you haven't started, those
   * you've completed, and those you're still working on.
   */
  def _____ = pending

  /*============================================================================
    All list functions are defined using generics. This is to -- hopefully --
    help you focus on the problem at hand without worrying about the types as
    much, though you're welcome to try to change that for any problem.

    In addition, in order for the use of `pending` to work, I've omitted the
    return type for all functions. You can add them back in as you like, since
    it's good practice and the compiler will help you not screw up in solving
    the problems.
  ============================================================================*/

  def last[T](list: List[T]) = _____

  test("P01 (*) Find the last element of a list") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    last(inputList) should equal (8)
  }


  def penultimate[T](list: List[T]) = _____

  test("P02 (*) Find the last but one element of a list") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    penultimate(inputList) should equal (5)
  }

  /* By convention, the first element in the list is element 0. */
  def nth[T](k: Int, list: List[T]) = _____

  test("P03 (*) Find the Kth element of a list") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    nth(2, inputList) should equal (2)
  }


  def length[T](list: List[T]) = _____

  test("P04 (*) Find the number of elements of a list") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    length(inputList) should equal (6)
  }


  def reverse[T](list: List[T]) = _____

  test("P05 (*) Reverse a list") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    val outputList = List(8, 5, 3, 2, 1, 1)
    reverse(inputList) should equal (outputList)
  }


  def isPalindrome[T](list: List[T]) = _____

  test("P06 (*) Find whether a list is a palindrome") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    val palindromeInputList = List(1, 2, 3, 2, 1)

    isPalindrome(inputList) should equal (false)
    isPalindrome(palindromeInputList) should equal (true)
  }


  def flatten[T](list: List[T]) = _____

  test("P07 (**) Flatten a nested list structure") {
    val inputList = List(1, 1, 2, 3, 5, 8)
    val nestedList = List(List(1, 1), 2, List(3, List(5, 8)))

    flatten(inputList) should equal (inputList)
  }


  /*=========================================================================*/


  /*
    If a list contains repeated elements they should be replaced with a
    single copy of the element. The order of the elements should not be
    changed.
  */
  def compress[T](list: List[T]) = _____

  test("P08 (**) Eliminate consecutive duplicates of list elements") {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val outputList = List('a, 'b, 'c, 'a, 'd, 'e)
    compress(inputList) should equal (outputList)
  }


  /*
    If a list contains repeated elements they should be placed in separate
    sublists.
  */
  def pack[T](list: List[T]) = _____

  test("P09 (**) Pack consecutive duplicates of list elements into sublists") {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val outputList = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    pack(inputList) should equal (outputList)
  }


  /*
    Use the result of problem P09 to implement the so-called run-length
    encoding data compression method. Consecutive duplicates of elements
    are encoded as tuples (N, E) where N is the number of duplicates of the
    element E.
  */
  def encode[T](list: List[T]) = _____

  test("P10 (*) Run-length encoding of a list") {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val outputList = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    encode(inputList) should equal (outputList)
  }


  /*
    Modify the result of problem P10 in such a way that if an element has no
    duplicates it is simply copied into the result list. Only elements with
    duplicates are transferred as (N, E) terms.
  */
  def encodeModified[T](list: List[T]) = _____

  test("P11 (*) Modified run-length encoding") {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val outputList = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    encodeModified(inputList) should equal (outputList)
  }


  /*
    Given a run-length code list generated as specified in problem P10,
    construct its uncompressed version.
  */
  def decode[T](list: List[T]) = _____

  test("P12 (**) Decode a run-length encoded list") {
    val encodedInputList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val outputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    decode(encodedInputList) should equal (outputList)
  }


  /*
    Implement the so-called run-length encoding data compression method
    directly. I.e. don't use other methods you've written (like P09's pack);
    do all the work directly.
  */
  def encodeDirect[T](list: List[T]) = _____

  test("P13 (**) Run-length encoding of a list (direct)") {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val outputList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    encodeDirect(inputList) should equal (outputList)
  }


  def duplicate[T](list: List[T]) = _____

  test("P14 (*) Duplicate the elements of a list") {
    val inputList = List('a, 'b, 'c, 'c, 'd)
    val outputList = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    duplicate(inputList) should equal (outputList)
  }


  def duplicateN[T](times: Int, list: List[T]) = _____

  test("P15 (**) Duplicate the elements of a list a given number of times") {
    val inputList = List('a, 'b, 'c, 'c, 'd)
    val outputList = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    duplicateN(3, inputList) should equal (outputList)
  }


  def dropEachN[T](N: Int, list: List[T]) = _____

  test("P16 (**) Duplicate the elements of a list a given number of times") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val outputList = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    dropEachN(3, inputList) should equal (outputList)
  }


  /* The length of the first part is given. Use a Tuple for your result. */
  def splitAt[T](splitAt: Int, list: List[T]) = _____

  test("P17 (*) Split a list into two parts") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val outputTuple = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    splitAt(3, inputList) should equal (outputTuple)
  }


  /*
    Given two indices, I and K, the slice is the list containing the elements
    from and including the Ith element up to but not including the Kth element
    of the original list. Start counting the elements with 0.
  */
  def slice[T](i: Int, k: Int, list: List[T]) = _____

  test("P18 (**) Extract a slice from a list") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val outputList = List('d, 'e, 'f, 'g)
    slice(3, 7, inputList) should equal (outputList)
  }


  def rotate[T](n: Int, list: List[T]) = _____

  test("P19 (**) Rotate a list N places to the left") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    val outputList1 = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    rotate(3, inputList) should equal (outputList1)

    val outputList2 = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    rotate(-2, inputList) should equal (outputList2)
  }


  /*
    Return the list and the removed element in a Tuple. Elements are numbered
    from 0.
  */
  def removeAt[T](k: Int, list: List[T]) = _____

  test("P20 (*) Remove the Kth element from a list") {
    val inputList = List('a, 'b, 'c, 'd)
    val outputTuple = (List('a, 'c, 'd), 'b)
    removeAt(1, inputList) should equal (outputTuple)
  }


  def insertAt[T](elem: T, k: Int, list: List[T]) = _____

  test("P21 (*) Insert an element at a given position into a list") {
    val inputList = List('a, 'b, 'c, 'd)
    val outputList = List('a, 'new, 'b, 'c, 'd)
    insertAt('new, 1, inputList) should equal (outputList)
  }


  def integersInRange(from: Int, to: Int) = _____

  test("P22 (*) Create a list containing all integers within a given range (inclusive)") {
    val outputList = List(4, 5, 6, 7, 8, 9)
    integersInRange(4, 9) should equal (outputList)
  }


  /* This method returns a list to appease the type gods in the test below */
  def randomSelect[T](n: Int, list: List[T]) = { _____ ; List() }

  test("P23 (**) Extract a given number of randomly selected elements from a list") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
    val outputList = randomSelect(3, inputList)

    /* The method for testing this is borrowed from Eric Torreborre's Scala 99
    problems tests. <https://github.com/etorreborre/s99> */

    outputList should have size (3)
    outputList.distinct should have size (outputList.size)
  }


  /* This method returns a list to appease the type gods in the test below. */
  def lotto[T](n: Int, m: Int) = { _____ ; List() }

  test("P24 (*) Draw N different numbers from the set 1..M") {
    val outputRange = 1 to 49
    val outputList = lotto(6, 49)

    outputList should have size (6)
    outputList foreach (outputRange should contain (_))
  }


  /* Hint: use the solution of problem P23. */
  def randomPermute[T](list: List[T]) = { _____ ; List() }

  test("P25 (**) Generate a random permutation of the elements of a list") {
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
    val outputList = randomPermute(inputList)

    /* The method for testing this is borrowed from Eric Torreborre's Scala 99
    problems tests. <https://github.com/etorreborre/s99> */

    outputList should have size (6)
    outputList.distinct should have size (outputList.size)
  }



}
