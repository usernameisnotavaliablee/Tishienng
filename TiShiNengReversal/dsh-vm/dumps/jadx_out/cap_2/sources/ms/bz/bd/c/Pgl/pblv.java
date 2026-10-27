package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblv {
    private static final ms.bz.bd.c.Pgl.pblv b = null;
    private android.content.Context a;

    static {
            ms.bz.bd.c.Pgl.pblv r0 = new ms.bz.bd.c.Pgl.pblv
            r0.<init>()
            ms.bz.bd.c.Pgl.pblv.b = r0
            return
    }

    public pblv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static ms.bz.bd.c.Pgl.pblv a() {
            ms.bz.bd.c.Pgl.pblv r0 = ms.bz.bd.c.Pgl.pblv.b
            return r0
    }

    public final void b(android.content.Context r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.a = r1
            return
    }

    public final android.content.Context c() {
            r1 = this;
            android.content.Context r0 = r1.a
            return r0
    }
}
