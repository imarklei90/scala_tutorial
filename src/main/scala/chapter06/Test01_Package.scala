package com{

  import com.scala.scala.Inner

  // 在外层包中定义单例对象
  object Outer{
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package scala{
    package scala{
      // 内层包中定义单例对象
      object Inner{
        var in: String = "in"
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

// 在同一文件中定义不同的包
package aaa{
  package bbb{

    object Test01_Package{
      def main(args: Array[String]): Unit = {
        import com.scala.scala.Inner
        println(Inner.in)
      }
    }
  }
}
