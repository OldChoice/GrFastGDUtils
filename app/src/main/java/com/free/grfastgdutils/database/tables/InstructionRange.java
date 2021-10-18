package com.free.grfastgdutils.database.tables;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class InstructionRange {
    //设置和使用的时候指令的范围

    @Id(autoincrement = true)
    private Long id;
    private String whichuiport;//我们点击了界面上哪一个串口设置
    private String startaddress;//开始地址名称，直接输入的（开始地址如果是40001，长度大于4，第一位只是判断是哪个种类，物理地址就要去掉第一位计算得到）
    private String startaddressmachine;//开始地址(物理地址)是名称中数据减1
    private String lenth;//长度


    @Generated(hash = 1906565932)
    public InstructionRange(Long id, String whichuiport, String startaddress,
                            String startaddressmachine, String lenth) {
        this.id = id;
        this.whichuiport = whichuiport;
        this.startaddress = startaddress;
        this.startaddressmachine = startaddressmachine;
        this.lenth = lenth;
    }

    @Generated(hash = 1847668282)
    public InstructionRange() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartaddress() {
        return startaddress;
    }

    public void setStartaddress(String startaddress) {
        this.startaddress = startaddress;
    }

    public String getLenth() {
        return lenth;
    }

    public void setLenth(String lenth) {
        this.lenth = lenth;
    }

    public String getWhichuiport() {
        return whichuiport;
    }

    public void setWhichuiport(String whichuiport) {
        this.whichuiport = whichuiport;
    }

    public String getStartaddressmachine() {
        return startaddressmachine;
    }

    public void setStartaddressmachine(String startaddressmachine) {
        this.startaddressmachine = startaddressmachine;
    }
}
