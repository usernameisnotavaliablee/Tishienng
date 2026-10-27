package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equals(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.Object r1) {
            boolean r0 = java.util.Objects.equals(r0, r1)
            return r0
    }

    public static int hash(@androidx.annotation.Nullable java.lang.Object... r0) {
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public static int hashCode(@androidx.annotation.Nullable java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            return r0
        L7:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> T requireNonNull(@androidx.annotation.Nullable T r0) {
            r0.getClass()
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> T requireNonNull(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String toString(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.toString()
            return r0
        L7:
            return r1
    }
}
