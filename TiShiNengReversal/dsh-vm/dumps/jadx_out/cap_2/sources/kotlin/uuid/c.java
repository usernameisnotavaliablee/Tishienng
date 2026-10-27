package kotlin.uuid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,277:1\n277#1:278\n277#1:279\n277#1:280\n277#1:281\n277#1:282\n277#1:283\n277#1:284\n277#1:285\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n139#1:278\n140#1:279\n184#1:280\n185#1:281\n224#1:282\n225#1:283\n271#1:284\n272#1:285\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.uuid.ExperimentalUuidApi
    public static final void a(long r1, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5, int r6) {
            java.lang.String r0 = "dst"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.uuid.d.r(r1, r3, r4, r5, r6)
            return
    }

    @kotlin.uuid.ExperimentalUuidApi
    public static final long b(@org.jetbrains.annotations.NotNull byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long r1 = kotlin.uuid.d.s(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid c(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.position()
            int r0 = r0 + 15
            int r1 = r5.limit()
            if (r0 >= r1) goto L34
            long r0 = r5.getLong()
            long r2 = r5.getLong()
            java.nio.ByteOrder r5 = r5.order()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r5 == 0) goto L2d
            long r0 = java.lang.Long.reverseBytes(r0)
            long r2 = java.lang.Long.reverseBytes(r2)
        L2d:
            kotlin.uuid.Uuid$a r5 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r5 = r5.b(r0, r2)
            return r5
        L34:
            java.nio.BufferUnderflowException r5 = new java.nio.BufferUnderflowException
            r5.<init>()
            throw r5
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid d(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r5 < 0) goto L5c
            int r0 = r5 + 15
            int r1 = r4.limit()
            if (r0 >= r1) goto L34
            long r0 = r4.getLong(r5)
            int r5 = r5 + 8
            long r2 = r4.getLong(r5)
            java.nio.ByteOrder r4 = r4.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L2d
            long r0 = java.lang.Long.reverseBytes(r0)
            long r2 = java.lang.Long.reverseBytes(r2)
        L2d:
            kotlin.uuid.Uuid$a r4 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r4 = r4.b(r0, r2)
            return r4
        L34:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not enough bytes to read a uuid at index: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", with limit: "
            r1.append(r5)
            int r4 = r4.limit()
            r1.append(r4)
            r4 = 32
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L5c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Negative index: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final java.nio.ByteBuffer e(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r5, int r6, @org.jetbrains.annotations.NotNull kotlin.uuid.Uuid r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.g0.p(r7, r0)
            long r0 = r7.getMostSignificantBits()
            long r2 = r7.getLeastSignificantBits()
            if (r6 < 0) goto L71
            int r7 = r6 + 15
            int r4 = r5.limit()
            if (r7 >= r4) goto L49
            java.nio.ByteOrder r7 = r5.order()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r4)
            if (r7 == 0) goto L32
            r5.putLong(r6, r0)
            int r6 = r6 + 8
            java.nio.ByteBuffer r5 = r5.putLong(r6, r2)
            goto L43
        L32:
            long r0 = java.lang.Long.reverseBytes(r0)
            r5.putLong(r6, r0)
            int r6 = r6 + 8
            long r0 = java.lang.Long.reverseBytes(r2)
            java.nio.ByteBuffer r5 = r5.putLong(r6, r0)
        L43:
            java.lang.String r6 = "toLongs(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            return r5
        L49:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not enough capacity to write a uuid at index: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", with limit: "
            r0.append(r6)
            int r5 = r5.limit()
            r0.append(r5)
            r5 = 32
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L71:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Negative index: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final java.nio.ByteBuffer f(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r5, @org.jetbrains.annotations.NotNull kotlin.uuid.Uuid r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.g0.p(r6, r0)
            long r0 = r6.getMostSignificantBits()
            long r2 = r6.getLeastSignificantBits()
            int r6 = r5.position()
            int r6 = r6 + 15
            int r4 = r5.limit()
            if (r6 >= r4) goto L47
            java.nio.ByteOrder r6 = r5.order()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r4)
            if (r6 == 0) goto L32
            r5.putLong(r0)
            java.nio.ByteBuffer r5 = r5.putLong(r2)
            goto L41
        L32:
            long r0 = java.lang.Long.reverseBytes(r0)
            r5.putLong(r0)
            long r0 = java.lang.Long.reverseBytes(r2)
            java.nio.ByteBuffer r5 = r5.putLong(r0)
        L41:
            java.lang.String r6 = "toLongs(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            return r5
        L47:
            java.nio.BufferOverflowException r5 = new java.nio.BufferOverflowException
            r5.<init>()
            throw r5
    }

    public static final long g(long r0) {
            long r0 = java.lang.Long.reverseBytes(r0)
            return r0
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid h() {
            r0 = 16
            byte[] r0 = new byte[r0]
            kotlin.uuid.a r1 = kotlin.uuid.a.a
            java.security.SecureRandom r1 = r1.a()
            r1.nextBytes(r0)
            kotlin.uuid.Uuid r0 = kotlin.uuid.d.w(r0)
            return r0
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object i(@org.jetbrains.annotations.NotNull kotlin.uuid.Uuid r5) {
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.uuid.e r0 = new kotlin.uuid.e
            long r1 = r5.getMostSignificantBits()
            long r3 = r5.getLeastSignificantBits()
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.uuid.ExperimentalUuidApi
    public static final void j(@org.jetbrains.annotations.NotNull byte[] r1, int r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.uuid.d.t(r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final java.util.UUID k(@org.jetbrains.annotations.NotNull kotlin.uuid.Uuid r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = r4.getMostSignificantBits()
            long r2 = r4.getLeastSignificantBits()
            java.util.UUID r4 = new java.util.UUID
            r4.<init>(r0, r2)
            return r4
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid l(@org.jetbrains.annotations.NotNull java.util.UUID r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.uuid.Uuid$a r0 = kotlin.uuid.Uuid.Companion
            long r1 = r5.getMostSignificantBits()
            long r3 = r5.getLeastSignificantBits()
            kotlin.uuid.Uuid r5 = r0.b(r1, r3)
            return r5
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid m(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "hexString"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.uuid.Uuid r1 = kotlin.uuid.d.x(r1)
            return r1
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid n(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "hexDashString"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.uuid.Uuid r1 = kotlin.uuid.d.y(r1)
            return r1
    }
}
