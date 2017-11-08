package jp.techacademy.aso.muneki.javalog;

/**
 * Created by muneki-aso on 2017/11/07.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "人";
    String hobby;  // 趣味

    // コンストラクタ
    public Human(String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。" );
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}