package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public /* synthetic */ class s {
    public static /* synthetic */ x3.u a(kotlin.reflect.jvm.internal.impl.load.java.t r0, kotlin.reflect.jvm.internal.impl.name.c r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 1
        L7:
            x3.u r0 = r0.c(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: findPackage"
            r0.<init>(r1)
            throw r0
    }
}
