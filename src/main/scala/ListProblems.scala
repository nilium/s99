package net.spifftastic.problems

/**
  Scala problems 1 to 28 from http://aperiodic.net/phil/scala/s-99/
*/
trait ListProblems {
  /*
    P01 (*) Find the last element of a list.

    Example:

    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
  */
  def last[T](list: List[T]): T = ???

  /*
    P02 (*) Find the last but one element of a list.

    Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
  */
  def penultimate[T](list: List[T]): T = ???

  /*
    P03 (*) Find the Kth element of a list.

    By convention, the first element in the list is element 0.

    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
  */
  def nth[T](k: Int, list: List[T]): T = ???

  /*
    P04 (*) Find the number of elements of a list.

    Example:

    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
  */
  def length[T](list: List[T]): Int = ???

  /*
    P05 (*) Reverse a list.

    Example:

    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
  def reverse[T](list: List[T]): List[T] = ???

  /*
    P06 (*) Find whether a list is a palindrome.

    Example:

    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
  */
  def isPalindrome[T](list: List[T]): Boolean = ???

  /*
    P07 (**) Flatten a nested list structure.

    Example:

    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
  def flatten[T](list: List[T]): List[Any] = ???

  /*
    P08 (**) Eliminate consecutive duplicates of list elements.

    If a list contains repeated elements they should be replaced with a
    single copy of the element. The order of the elements should not be
    changed.

    Example:

    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
  def compress[T](list: List[T]): List[T] = ???

  /*
    P09 (**) Pack consecutive duplicates of list elements into sublists.

    If a list contains repeated elements they should be placed in separate
    sublists.

    Example:

    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
  def pack[T](list: List[T]): List[List[T]] = ???

  /*
    P10 (*) Run-length encoding of a list.

    Use the result of problem P09 to implement the so-called run-length
    encoding data compression method. Consecutive duplicates of elements
    are encoded as tuples (N, E) where N is the number of duplicates of the
    element E.

    Example:

    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
  def encode[T](list: List[T]): List[(Int, T)] = ???

  /*
    P11 (*) Modified run-length encoding.

    Modify the result of problem P10 in such a way that if an element has no
    duplicates it is simply copied into the result list. Only elements with
    duplicates are transferred as (N, E) terms.

    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */
  def encodeModified[T](list: List[T]): List[Any] = ???

  /*
    P12 (**) Decode a run-length encoded list.

    Given a run-length code list generated as specified in problem P10,
    construct its uncompressed version.

    Example:

    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */
  def decode[T](list: List[(Int, T)]): List[T] = ???

  /*
    P13 (**) Run-length encoding of a list (direct).

    Implement the so-called run-length encoding data compression method
    directly. I.e. don't use other methods you've written (like P09's pack);
    do all the work directly.

    Example:

    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
  def encodeDirect[T](list: List[T]): List[(Int, T)] = ???

  /*
    P14 (*) Duplicate the elements of a list.

    Example:

    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */
  def duplicate[T](list: List[T]): List[T] = ???

  /*
    P15 (**) Duplicate the elements of a list a given number of times.

    Example:

    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
  def duplicateN[T](times: Int, list: List[T]): List[T] = ???

  /*
    P16 (**) Duplicate the elements of a list a given number of times.

    Example:

    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
  def drop[T](N: Int, list: List[T]): List[T] = ???

  /*
    P17 (*) Split a list into two parts.

    The length of the first part is given. Use a Tuple for your result.

    Example:

    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */
  def split[T](length: Int, list: List[T]): (List[T], List[T]) = ???

  /*
    P18 (**) Extract a slice from a list.

    Given two indices, I and K, the slice is the list containing the elements
    from and including the Ith element up to but not including the Kth element
    of the original list. Start counting the elements with 0.

    Example:

    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
  def slice[T](i: Int, k: Int, list: List[T]): List[T] = ???

  /*
    P19 (**) Rotate a list N places to the left.

    Examples:

    scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

    scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
  def rotate[T](n: Int, list: List[T]): List[T] = ???

  /*
    P20 (*) Remove the Kth element from a list.

    Return the list and the removed element in a Tuple. Elements are numbered
    from 0.

    Example:

    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
  def removeAt[T](k: Int, list: List[T]): (List[T], T) = ???

  /*
    P21 (*) Insert an element at a given position into a list.

    Example:

    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
  def insertAt[T](elem: T, k: Int, list: List[T]): List[T] = ???

  /*
    P22 (*) Create a list containing all integers within a given range.

    Example:

    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
  def integersInRange(from: Int, to: Int): List[Int] = ???

  /*
    P23 (**) Extract a given number of randomly selected elements from a list.

    Example:

    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)

    Hint: Use the solution to problem P20

    (This method returns a list to appease the type gods in the test below.)
  */
  def randomSelect[T](n: Int, list: List[T]): List[T] = ???

  /*
    P24 (*) Draw N different numbers from the set 1..M.

    Example:

    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)

    (This method returns a list to appease the type gods in the test below.)
  */
  def lotto(n: Int, m: Int): List[Int] = ???

  /*
    P25 (**) Generate a random permutation of the elements of a list.

    Hint: use the solution of problem P23.

    Example:

    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */
  def randomPermute[T](list: List[T]): List[T] = ???

  /*
    P26 (**) Generate the combinations of K distinct objects chosen from the N
    elements of a list.

    In how many ways can a committee of 3 be chosen from a group of 12 people?
    We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
    well-known binomial coefficient). For pure mathematicians, this result may
    be great. But we want to really generate all the possibilities.

    Example:

    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  */
  def combination[T](list: List[T]): List[List[T]] = ???

  /*
    P27 (**) Group the elements of a set into disjoint subsets.

    a) In how many ways can a group of 9 people work in 3 disjoint subgroups
    of 2, 3 and 4 persons? Write a function that generates all the
    possibilities.

    Example:

    scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...

    b) Generalize the above predicate in a way that we can specify a list of
    group sizes and the predicate will return a list of groups.

    Example:

    scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...

    Note that we do not want permutations of the group members;
    i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...).
    However, we make a difference between ((Aldo, Beat), (Carla, David), ...)
    and ((Carla, David), (Aldo, Beat), ...).

    You may find more about this combinatorial problem in a good book on
    discrete mathematics under the term "multinomial coefficients".
  */
  def group3[T](list: List[T]): List[List[List[T]]] = ???
  def group[T](lists: List[Int], list: List[T]): List[List[List[T]]] = ???

  /*
    P28 (**) Sorting a list of lists according to length of sublists.

    a) We suppose that a list contains elements that are lists themselves.
    The objective is to sort the elements of the list according to their
    length. E.g. short lists first, longer lists later, or vice versa.

    Example:

    scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))

    b) Again, we suppose that a list contains elements that are lists
    themselves. But this time the objective is to sort the elements according
    to their length frequency; i.e. in the default, sorting is done
    ascendingly, lists with rare lengths are placed, others with a more
    frequent length come later.

    Example:

    scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))

    Note that in the above example, the first two lists in the result have
    length 4 and 1 and both lengths appear just once. The third and fourth
    lists have length 3 and there are two list of this length. Finally, the
    last three lists have length 2. This is the most frequent length.
  */
  def lsort[T](list: List[List[T]]): List[List[T]] = ???

  def lsortFreq[T](list: List[List[T]]): List[List[T]] = ???
}
