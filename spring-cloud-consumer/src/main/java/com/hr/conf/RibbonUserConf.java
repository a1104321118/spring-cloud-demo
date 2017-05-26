package com.hr.conf;

/**
 * Created by hr on 2017/5/15.
 */
//@Configuration
//@RibbonClient(name = "user-provider", configuration = RibbonUserConf.class)
public class RibbonUserConf {

    //这样写会造成重复扫描的问题，所以会把该配置文件放在 MainClass的外面
}
