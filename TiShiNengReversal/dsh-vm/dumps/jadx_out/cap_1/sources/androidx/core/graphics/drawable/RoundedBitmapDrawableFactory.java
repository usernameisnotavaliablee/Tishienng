package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoundedBitmapDrawableFactory {
    private static final java.lang.String TAG = "RoundedBitmapDrawableFa";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DefaultRoundedBitmapDrawable extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(android.content.res.Resources r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void gravityCompatApply(int r7, int r8, int r9, android.graphics.Rect r10, android.graphics.Rect r11) {
                r6 = this;
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                androidx.core.view.GravityCompat.apply(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBitmap
                if (r0 == 0) goto Lc
                boolean r0 = androidx.core.graphics.BitmapCompat.hasMipMap(r0)
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean r2) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBitmap
                if (r0 == 0) goto La
                androidx.core.graphics.BitmapCompat.setHasMipMap(r0, r2)
                r1.invalidateSelf()
            La:
                return
        }
    }

    private RoundedBitmapDrawableFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.Nullable android.graphics.Bitmap r2) {
            androidx.core.graphics.drawable.RoundedBitmapDrawable21 r0 = new androidx.core.graphics.drawable.RoundedBitmapDrawable21
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull java.io.InputStream r2) {
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)
            androidx.core.graphics.drawable.RoundedBitmapDrawable r1 = create(r1, r0)
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 != 0) goto L11
            java.util.Objects.toString(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1)
            androidx.core.graphics.drawable.RoundedBitmapDrawable r0 = create(r0, r1)
            r0.getBitmap()
            return r0
    }
}
