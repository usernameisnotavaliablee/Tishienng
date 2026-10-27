package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbln {
    public pbln() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto La
            r0.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        La:
            return
    }
}
