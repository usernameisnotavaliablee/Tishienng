package d4;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public /* synthetic */ class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState a(d4.n r0, boolean r1, boolean r2, boolean r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lc
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0 = r0.U(r1, r2, r3)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: newTypeCheckerState"
            r0.<init>(r1)
            throw r0
    }
}
