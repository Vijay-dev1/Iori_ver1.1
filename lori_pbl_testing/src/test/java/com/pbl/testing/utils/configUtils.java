package com.pbl.testing.utils;


import java.io.File;



public class configUtils extends GlobalVarianbles{

    public static XmlUtils getEnvFilePathAsXml() {
        File envFile = new File(envConfigFile);
        XmlUtils xml = new XmlUtils(envFile);
        return xml;
    }
    public static String getElementValue(String objId, String elementId) {
        String idText = "@id='"+objId+"'";
        String ret = "";
        XmlUtils xml = getEnvFilePathAsXml();
        ret = xml.getData("//object[" + idText + "]/" + elementId);
        return ret;
    }
    public static String getEnvUrl(){
        String url = getElementValue("base","loginUrl");
        return url;
    }

}
