package com.garysieling

/**
  * A object to print out 'microformat' API docs.
  *
  * Specify the `name`, `age`, and `weight` when creating a new `Person`,
  * then access the fields like this:
  * {{{
  * val p = Person("Al", 42, 200.0)
  * p.name
  * p.age
  * p.weight
  * }}}
  *
  * Did you know: The [[com.acme.foo.Employee]] extends this class.
  *
  * @constructor Create a new person with a `name`, `age`, and `weight`.
  * @param name The person's name.
  * @param age The person's age.
  * @param weight The person's weight.
  * @author Gary Sieling
  * @version 1.0
  * @todo Add more functionality.
  * @see See [[http://garysieling.com garysieling.com]] for more "
  * information.
  */
object MicroformatScalaDoc {
  /**
   * Main method
   *
   * @param args command line args - unused
   */
  def main(args: Array[String]) = {
    println("""
{
   "@context": "http://schema.org",
   "@type": "APIReference",
   "url": "https://www.example-petstore.com/",
   "author": "Gary Sieling",
   "datePublished": "2-13-2016",
   "headline": "Microformat Test",
   "publisher": {
      "@type": "Organization",
      "logo": {
        "@type": "ImageObject",
        "url": "https://www.garysieling.com/blog/wp-content/uploads/2016/01/14519545372291.jpeg",
        "height": 10,
        "width": 100
      },
      "name": "garysieling.com"
   },
   "image": {
       "@type": "ImageObject",
       "url": "https://www.garysieling.com/blog/wp-content/uploads/2016/01/14519545372291.jpeg",
       "height": 10,
       "width": "100"
   },
   "dateModified": "2-13-2016",
   "mainEntityOfPage": "test"
}
""")
  }
}
