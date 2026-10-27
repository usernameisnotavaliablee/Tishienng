package kotlinx.coroutines.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a implements kotlinx.coroutines.internal.c0 {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.c0
    public int a() {
            r1 = this;
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            return r0
    }

    @Override // kotlinx.coroutines.internal.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            return r0
    }

    @Override // kotlinx.coroutines.internal.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.p2 c(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlinx.coroutines.internal.c0> r4) {
            r3 = this;
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r4 == 0) goto L13
            kotlinx.coroutines.android.d r0 = new kotlinx.coroutines.android.d
            r1 = 1
            android.os.Handler r4 = kotlinx.coroutines.android.g.e(r4, r1)
            r1 = 2
            r2 = 0
            r0.<init>(r4, r2, r1, r2)
            return r0
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "The main looper is not available"
            r4.<init>(r0)
            throw r4
    }
}
