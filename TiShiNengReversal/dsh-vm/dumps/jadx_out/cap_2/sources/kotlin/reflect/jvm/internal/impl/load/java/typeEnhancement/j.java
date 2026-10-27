package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier a;
    private final boolean b;

    public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "qualifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public /* synthetic */ j(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1, boolean r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1, boolean r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            boolean r2 = r0.b
        Lc:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r0.a(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "qualifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r1.a
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.b
            boolean r5 = r5.b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.b
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NullabilityQualifierWithMigrationStatus(qualifier="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isForWarningOnly="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
