package com.garysieling

object MicroformatScalaDoc {
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
