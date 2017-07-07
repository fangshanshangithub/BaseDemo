package com.cn.hnust.untils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesUtils {

    private static final Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
    private static Properties props;

    synchronized static private void loadProps(String fileName){
        logger.info("开始加载" + fileName + "文件内容.......");
        props = new Properties();
        InputStream in = null;
        try {
            // 要加载的属性文件
            in = PropertiesUtils.class.getClassLoader().getResourceAsStream("conf/setting/vas.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            logger.error(fileName + "文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            try {
                if(null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error(fileName + "文件流关闭出现异常");
            }
        }
        logger.info("加载" + fileName + "文件内容完成...........");
        logger.info(fileName + "文件内容：" + props);
    }

    public static String getProperty(String fileName, String key){
        if(null == props) {
            loadProps(fileName);
        }
        return props.getProperty(key);
    }

    public static String getProperty(String fileName, String key, String defaultValue) {
        if(null == props) {
            loadProps(fileName);
        }
        return props.getProperty(key, defaultValue);
    }

}
