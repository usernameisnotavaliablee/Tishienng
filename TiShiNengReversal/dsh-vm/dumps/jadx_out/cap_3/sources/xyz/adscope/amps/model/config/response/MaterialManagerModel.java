package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MaterialManagerModel {
    private int imageCount;
    private java.lang.String maxSize;
    private java.lang.String minSize;
    private int random;
    private xyz.adscope.amps.model.config.response.SimilarStrategyModel similarStrategy;
    private java.lang.String url;
    private java.lang.String waitTime;

    public MaterialManagerModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getImageCount() {
            r1 = this;
            int r0 = r1.imageCount
            return r0
    }

    public java.lang.String getMaxSize() {
            r1 = this;
            java.lang.String r0 = r1.maxSize
            return r0
    }

    public java.lang.String getMinSize() {
            r1 = this;
            java.lang.String r0 = r1.minSize
            return r0
    }

    public int getRandom() {
            r1 = this;
            int r0 = r1.random
            return r0
    }

    public xyz.adscope.amps.model.config.response.SimilarStrategyModel getSimilarStrategy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.SimilarStrategyModel r0 = r1.similarStrategy
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public java.lang.String getWaitTime() {
            r1 = this;
            java.lang.String r0 = r1.waitTime
            return r0
    }

    public void setImageCount(int r1) {
            r0 = this;
            r0.imageCount = r1
            return
    }

    public void setMaxSize(java.lang.String r1) {
            r0 = this;
            r0.maxSize = r1
            return
    }

    public void setMinSize(java.lang.String r1) {
            r0 = this;
            r0.minSize = r1
            return
    }

    public void setRandom(int r1) {
            r0 = this;
            r0.random = r1
            return
    }

    public void setSimilarStrategy(xyz.adscope.amps.model.config.response.SimilarStrategyModel r1) {
            r0 = this;
            r0.similarStrategy = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    public void setWaitTime(java.lang.String r1) {
            r0 = this;
            r0.waitTime = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"url\":\""
            r0.append(r1)
            java.lang.String r1 = r2.url
            r0.append(r1)
            java.lang.String r1 = "\", \"random\":"
            r0.append(r1)
            int r1 = r2.random
            r0.append(r1)
            java.lang.String r1 = ", \"imageCount\":"
            r0.append(r1)
            int r1 = r2.imageCount
            r0.append(r1)
            java.lang.String r1 = ", \"waitTime\":\""
            r0.append(r1)
            java.lang.String r1 = r2.waitTime
            r0.append(r1)
            java.lang.String r1 = "\", \"maxSize\":\""
            r0.append(r1)
            java.lang.String r1 = r2.maxSize
            r0.append(r1)
            java.lang.String r1 = "\", \"minSize\":\""
            r0.append(r1)
            java.lang.String r1 = r2.minSize
            r0.append(r1)
            java.lang.String r1 = "\", \"similarStrategy\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.SimilarStrategyModel r1 = r2.similarStrategy
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
