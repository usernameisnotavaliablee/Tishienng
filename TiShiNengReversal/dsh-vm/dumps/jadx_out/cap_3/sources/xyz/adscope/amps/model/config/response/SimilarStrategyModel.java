package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SimilarStrategyModel {
    private java.lang.String cacheTime;
    private int isOpen;
    private int isReport;
    private int similarity;

    public SimilarStrategyModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getCacheTime() {
            r1 = this;
            java.lang.String r0 = r1.cacheTime
            return r0
    }

    public int getIsOpen() {
            r1 = this;
            int r0 = r1.isOpen
            return r0
    }

    public int getIsReport() {
            r1 = this;
            int r0 = r1.isReport
            return r0
    }

    public int getSimilarity() {
            r1 = this;
            int r0 = r1.similarity
            return r0
    }

    public void setCacheTime(java.lang.String r1) {
            r0 = this;
            r0.cacheTime = r1
            return
    }

    public void setIsOpen(int r1) {
            r0 = this;
            r0.isOpen = r1
            return
    }

    public void setIsReport(int r1) {
            r0 = this;
            r0.isReport = r1
            return
    }

    public void setSimilarity(int r1) {
            r0 = this;
            r0.similarity = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"isOpen\":"
            r0.append(r1)
            int r1 = r2.isOpen
            r0.append(r1)
            java.lang.String r1 = ", \"cacheTime\":\""
            r0.append(r1)
            java.lang.String r1 = r2.cacheTime
            r0.append(r1)
            java.lang.String r1 = "\", \"similarity\":"
            r0.append(r1)
            int r1 = r2.similarity
            r0.append(r1)
            java.lang.String r1 = ", \"isReport\":"
            r0.append(r1)
            int r1 = r2.isReport
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
