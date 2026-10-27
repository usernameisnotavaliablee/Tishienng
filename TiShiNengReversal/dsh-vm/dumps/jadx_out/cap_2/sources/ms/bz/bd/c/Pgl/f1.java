package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f1 implements java.io.FilenameFilter {
    final /* synthetic */ java.lang.String a;

    f1(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r0.a
            boolean r1 = r2.startsWith(r1)
            return r1
    }
}
