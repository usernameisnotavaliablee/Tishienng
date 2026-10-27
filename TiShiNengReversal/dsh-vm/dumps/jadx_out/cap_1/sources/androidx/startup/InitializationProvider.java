package androidx.startup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not allowed."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L19
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L17
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r0)
            java.lang.Class r1 = r2.getClass()
            r0.discoverAndInitialize(r1)
        L17:
            r0 = 1
            return r0
        L19:
            androidx.startup.StartupException r0 = new androidx.startup.StartupException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String[] r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4, @androidx.annotation.Nullable java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final int update(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }
}
