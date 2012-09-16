trait Container[M[_]] {
  def put[A](x: A)
  def get[A](m: M[A]): A
}

