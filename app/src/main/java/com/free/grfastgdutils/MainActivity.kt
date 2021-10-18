package com.free.grfastgdutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.free.grfastgdutils.database.manage.TableDbManagerInstructionRange
import com.free.grfastgdutils.database.tables.InstructionRange
import java.util.ArrayList

/**
 * Create by guorui on 2020/11/25
 * Last update 2020/11/25
 * Description:把整个项目直接复制到项目中，其他全都配置
 * tables中写入表，只需要写入顶部，其他自动生成
 * manage中写使用方法等
 * 升级是helper每次加入所有表
 *
 **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

    }

    private fun test() {
//        TableDbManagerInstructionRange.getInstance().deleteAll()
        val list: MutableList<InstructionRange> = ArrayList<InstructionRange>()
        list.add(InstructionRange(null, "串口1", "40001", "1", "110"))
        list.add(InstructionRange(null, "串口1", "40113", "113", "5"))
        var sf = TableDbManagerInstructionRange.getInstance().insertList(list)
        println(sf)
        var ms = TableDbManagerInstructionRange.getInstance().loadAll()
        println(ms.size)

    }

}