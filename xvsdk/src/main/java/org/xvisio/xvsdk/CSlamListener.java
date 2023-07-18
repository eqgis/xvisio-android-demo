package org.xvisio.xvsdk;

/**
 * CSLAM建图监听事件
 * @author tanyx 2023/7/18
 * @version 1.0
 * <br/>SampleCode:<br/>
 * <code>
 *
 * </code>
 **/
public interface CSlamListener {
    /**
     * 当地图保存完成时回调
     * @param quality 质量评估，取值范围[0,100]
     */
    void doneCallback(int status,int quality);

    /**
     * 基于参考地图定位的相似度回调
     * @param percent 比例，取值范围[0,1]
     */
    void localizeOnReferenceMap(float percent);
}
