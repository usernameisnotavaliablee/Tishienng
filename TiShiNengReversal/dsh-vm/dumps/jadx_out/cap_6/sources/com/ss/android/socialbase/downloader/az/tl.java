package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class tl<K, T> extends java.util.LinkedHashMap<K, T> {
    private int j;

    public tl() {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r0)
            return
    }

    public tl(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public tl(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r2, r0, r4)
            r1.j(r3)
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(java.util.Map.Entry<K, T> r2) {
            r1 = this;
            int r2 = r1.size()
            int r0 = r1.j
            if (r2 <= r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
