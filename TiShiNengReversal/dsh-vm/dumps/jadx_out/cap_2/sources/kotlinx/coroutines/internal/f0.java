package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f0 extends kotlinx.coroutines.p2 implements kotlinx.coroutines.z0 {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Throwable a;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String b;

    public f0(@org.jetbrains.annotations.Nullable java.lang.Throwable r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* synthetic */ f0(java.lang.Throwable r1, java.lang.String r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final java.lang.Void w() {
            r4 = this;
            java.lang.Throwable r0 = r4.a
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.b
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.a
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.e0.e()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlinx.coroutines.m0
    public /* bridge */ /* synthetic */ void dispatch(kotlin.coroutines.i r1, java.lang.Runnable r2) {
            r0 = this;
            r0.v(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.z0
    public /* bridge */ /* synthetic */ void i(long r1, kotlinx.coroutines.p r3) {
            r0 = this;
            r0.x(r1, r3)
            return
    }

    @Override // kotlinx.coroutines.m0
    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            r0.w()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.p2, kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r1) {
            r0 = this;
            r0.w()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r0 = this;
            r0.w()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.z0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object r(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.z0.a.a(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.p2
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.p2 t() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.p2, kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dispatchers.Main[missing"
            r0.append(r1)
            java.lang.Throwable r1 = r3.a
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", cause="
            r1.append(r2)
            java.lang.Throwable r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L24
        L22:
            java.lang.String r1 = ""
        L24:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void v(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r0.w()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void x(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r3) {
            r0 = this;
            r0.w()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }
}
