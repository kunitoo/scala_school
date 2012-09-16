class MakeFoo[A](implicit manifest: Manifest[A]) {
  def make: A = manifest.erasure.newInstance.asInstanceOf[A]
}
