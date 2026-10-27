package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends pl.droidsonroids.gif.l {
        private final android.content.res.AssetFileDescriptor a;

        public b(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.AssetFileDescriptor r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends pl.droidsonroids.gif.l {
        private final android.content.res.AssetManager a;
        private final java.lang.String b;

        public c(@androidx.annotation.NonNull android.content.res.AssetManager r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r3 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.AssetManager r1 = r3.a
                java.lang.String r2 = r3.b
                android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends pl.droidsonroids.gif.l {
        private final byte[] a;

        public d(@androidx.annotation.NonNull byte[] r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                byte[] r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e extends pl.droidsonroids.gif.l {
        private final java.nio.ByteBuffer a;

        public e(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.nio.ByteBuffer r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f extends pl.droidsonroids.gif.l {
        private final java.io.FileDescriptor a;

        public f(@androidx.annotation.NonNull java.io.FileDescriptor r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.io.FileDescriptor r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g extends pl.droidsonroids.gif.l {
        private final java.lang.String a;

        public g(@androidx.annotation.NonNull java.io.File r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.String r2 = r2.getPath()
                r1.a = r2
                return
        }

        public g(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.lang.String r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h extends pl.droidsonroids.gif.l {
        private final java.io.InputStream a;

        public h(@androidx.annotation.NonNull java.io.InputStream r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.io.InputStream r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class i extends pl.droidsonroids.gif.l {
        private final android.content.res.Resources a;
        private final int b;

        public i(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r3 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.Resources r1 = r3.a
                int r2 = r3.b
                android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r2)
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class j extends pl.droidsonroids.gif.l {
        private final android.content.ContentResolver a;
        private final android.net.Uri b;

        public j(@androidx.annotation.Nullable android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // pl.droidsonroids.gif.l
        pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException {
                r2 = this;
                android.content.ContentResolver r0 = r2.a
                android.net.Uri r1 = r2.b
                pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifInfoHandle.y(r0, r1)
                return r0
        }
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ l(pl.droidsonroids.gif.l.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    final pl.droidsonroids.gif.e a(pl.droidsonroids.gif.e r2, java.util.concurrent.ScheduledThreadPoolExecutor r3, boolean r4, pl.droidsonroids.gif.h r5) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.e r0 = new pl.droidsonroids.gif.e
            pl.droidsonroids.gif.GifInfoHandle r5 = r1.b(r5)
            r0.<init>(r5, r2, r3, r4)
            return r0
    }

    final pl.droidsonroids.gif.GifInfoHandle b(@androidx.annotation.NonNull pl.droidsonroids.gif.h r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.c()
            char r1 = r3.a
            boolean r3 = r3.b
            r0.K(r1, r3)
            return r0
    }

    abstract pl.droidsonroids.gif.GifInfoHandle c() throws java.io.IOException;
}
