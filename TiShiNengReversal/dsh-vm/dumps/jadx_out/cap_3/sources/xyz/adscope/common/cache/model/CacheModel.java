package xyz.adscope.common.cache.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CacheModel {
    private java.lang.String a;
    private long b;
    private long c;
    private int d;

    public CacheModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getCanDelete() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long getFileSize() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public long getLastUsedTime() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public void setCanDelete(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setFileName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setFileSize(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setLastUsedTime(long r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
