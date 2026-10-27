package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.database.Cursor query(@androidx.annotation.NonNull android.content.ContentResolver r1, @androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.Nullable java.lang.String[] r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String[] r5, @androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.Nullable android.os.CancellationSignal r7) {
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r0 = move-exception
            r1 = r0
            boolean r2 = r1 instanceof android.os.OperationCanceledException
            if (r2 == 0) goto L11
            androidx.core.os.OperationCanceledException r1 = new androidx.core.os.OperationCanceledException
            r1.<init>()
            throw r1
        L11:
            throw r1
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.database.Cursor query(@androidx.annotation.NonNull android.content.ContentResolver r7, @androidx.annotation.NonNull android.net.Uri r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String[] r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r13) {
            if (r13 == 0) goto L10
            java.lang.Object r13 = r13.getCancellationSignalObject()
            android.os.CancellationSignal r13 = (android.os.CancellationSignal) r13
        L8:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto L12
        L10:
            r13 = 0
            goto L8
        L12:
            android.database.Cursor r7 = query(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
