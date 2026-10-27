package k0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private final long a;
    private final long b;
    private final long c;

    public a(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            return
    }

    public static /* synthetic */ k0.a e(k0.a r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            long r8 = r7.a
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Ld
            long r10 = r7.b
        Ld:
            r3 = r10
            r8 = r14 & 4
            if (r8 == 0) goto L14
            long r12 = r7.c
        L14:
            r0 = r7
            r5 = r12
            k0.a r7 = r0.d(r1, r3, r5)
            return r7
    }

    public final long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public final long b() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final long c() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final k0.a d(long r8, long r10, long r12) {
            r7 = this;
            k0.a r0 = new k0.a
            r1 = r8
            r3 = r10
            r5 = r12
            r0.<init>(r1, r3, r5)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof k0.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k0.a r8 = (k0.a) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            long r3 = r7.c
            long r5 = r8.c
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L27
            return r2
        L27:
            return r0
    }

    public final long f() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public final long g() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final long h() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            int r0 = r0 * 31
            long r1 = r3.b
            int r1 = androidx.camera.camera2.internal.compat.params.e.a(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.c
            int r1 = androidx.camera.camera2.internal.compat.params.e.a(r1)
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r8 = this;
            long r0 = r8.a
            long r2 = r8.b
            long r4 = r8.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "CountDistanceTime(count="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = ", distance="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ", time="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}
