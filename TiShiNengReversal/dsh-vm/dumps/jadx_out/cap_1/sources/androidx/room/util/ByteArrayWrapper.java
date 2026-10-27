package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ByteArrayWrapper {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final byte[] array;

    public ByteArrayWrapper(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.array = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.room.util.ByteArrayWrapper
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            byte[] r0 = r1.array
            androidx.room.util.ByteArrayWrapper r2 = (androidx.room.util.ByteArrayWrapper) r2
            byte[] r2 = r2.array
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.array
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
