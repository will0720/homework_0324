import java.util.*;

class animal {
    String name;
    double height;
    int weight;
    int speed; 

    void show() {
        System.out.println("姓名: " + name);
        System.out.println("身高: " + height + "公尺");
        System.out.println("體重: " + weight + "公斤");
        System.out.println("速度: " + speed + "公尺/分鐘");
    }

    double distance(int x, double y) {
        return x * y * speed;
    }

    int distance(int x) {
        return x * speed;
    }
}

public class A1113302_0324_1 {
    public static void main(String[] argv) {
        animal[] role = new animal[4];

        for(int i = 0 ; i < role.length ; i++) {
            role[i] = new animal();
        }
        
        role[0].name = "雪寶";
        role[0].height = 1.1;
        role[0].weight = 52;
        role[0].speed = 100;

        role[1].name = "驢子";
        role[1].height = 1.5;
        role[1].weight = 99;
        role[1].speed = 200;

        role[2].name = "安那";
        role[2].height = 1.7;
        role[2].weight = 48;
        role[2].speed = 120;

        role[3].name = "愛沙";
        role[3].height = 1.7;
        role[3].weight = 50;
        role[3].speed = 120;

        for(int i = 0 ; i < role.length ; i++) {
            role[i].show();
            System.out.println(); 
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < role.length ; i++) {
            System.out.println("請輸入" + role[i].name + "的奔跑時間(分鐘):");
            int x = sc.nextInt();
            System.out.println("請輸入" + role[i].name + "的加速度(若無請輸入0):");
            double y = sc.nextDouble();

            double distance;
            if(y == 0) {
                distance= role[i].distance(x);
            } else {
                distance= role[i].distance(x,y);
            }
            System.out.println(role[i].name + "奔跑的距離為" + distance +"公尺");
        }
    }
}







