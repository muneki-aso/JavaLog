package jp.techacademy.aso.muneki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("玉城", 24, "マンドリン");     // 名前を玉城、年齢24歳、趣味マンドリンで、Humanのインスタンスを作る

        human.say();

        Human human2 = new Human("麻生", 26, "ギター");     // 名前を麻生、年齢26歳、趣味ギターで、Humanのインスタンスを作る

        human2.think();
    }

}