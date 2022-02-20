package kr.co.smartsoft.kotlinbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnLog가 눌리면 어떤 코드를 실행할지, 할 일을 설정.
        btnLog.setOnClickListener {
//            로그를 찍어보는 기능 실행 => btnLog가 클릭될 때 마다 실행
            Log.d("메인화면","로그 버튼 눌림")
            Log.d("메인화면","로그 찍어 보기")
            Log.e("메이화면","e(에러로그) 찍어보기")
        }

        btnToast.setOnClickListener {
            Log.d("메이화면", "토스트 버튼")
            Toast.makeText(this, "토스트를 뛰워봅니다.", Toast.LENGTH_SHORT).show()
        }
        
        btnVariable.setOnClickListener { 
//            변수의 연습 시작점
//            본인의 이름을 변수에 담아보자 => 토스트로 띄우자.
            var myName : String

            myName = "이성노"

            val friendName: String
            friendName = "이선생"
//            friendName = "김성생"  val에는 새 값 교체 불가

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

            var myBirthYear : Int
            myBirthYear = 1988

            var myHeight : Double
            myHeight = 170.0



        }
    }
}