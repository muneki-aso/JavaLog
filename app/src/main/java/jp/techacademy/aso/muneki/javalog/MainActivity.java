package jp.techacademy.aso.muneki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("麻生", 26, "ギター");     // 名前を麻生、年齢26歳、趣味ギターで、Humanのインスタンスを作る

        human.say();

        human.think();
    }

}