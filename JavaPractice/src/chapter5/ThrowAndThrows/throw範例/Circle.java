package chapter5.ThrowAndThrows.throw範例;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("半徑不能是負的!");
        } else {
            this.radius = radius;
        }
    }
}

// 如果在method內要直接拋出Exception的話(不是明確指定的錯誤，ex:IllegalArgumentException…etc)，則method要加上throws
// Exception或是將該段程式碼用try/catch包起來，不然會噴錯
// public class Circle {
//     double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public void setRadius(double radius) throws Exception {
//         try {
//             if (radius < 0) {
//                 throw new Exception("半徑不能是負的!");
//             } else {
//                 this.radius = radius;
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }