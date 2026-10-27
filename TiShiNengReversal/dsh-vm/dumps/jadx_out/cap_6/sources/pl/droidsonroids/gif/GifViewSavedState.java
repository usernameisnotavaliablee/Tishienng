package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class GifViewSavedState extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<pl.droidsonroids.gif.GifViewSavedState> CREATOR = null;
    final long[][] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<pl.droidsonroids.gif.GifViewSavedState> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public pl.droidsonroids.gif.GifViewSavedState a(android.os.Parcel r3) {
                r2 = this;
                pl.droidsonroids.gif.GifViewSavedState r0 = new pl.droidsonroids.gif.GifViewSavedState
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public pl.droidsonroids.gif.GifViewSavedState[] b(int r1) {
                r0 = this;
                pl.droidsonroids.gif.GifViewSavedState[] r1 = new pl.droidsonroids.gif.GifViewSavedState[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ pl.droidsonroids.gif.GifViewSavedState createFromParcel(android.os.Parcel r1) {
                r0 = this;
                pl.droidsonroids.gif.GifViewSavedState r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ pl.droidsonroids.gif.GifViewSavedState[] newArray(int r1) {
                r0 = this;
                pl.droidsonroids.gif.GifViewSavedState[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            pl.droidsonroids.gif.GifViewSavedState$a r0 = new pl.droidsonroids.gif.GifViewSavedState$a
            r0.<init>()
            pl.droidsonroids.gif.GifViewSavedState.CREATOR = r0
            return
    }

    private GifViewSavedState(android.os.Parcel r4) {
            r3 = this;
            r3.<init>(r4)
            int r0 = r4.readInt()
            long[][] r0 = new long[r0][]
            r3.a = r0
            r0 = 0
        Lc:
            long[][] r1 = r3.a
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            long[] r2 = r4.createLongArray()
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L1a:
            return
    }

    /* synthetic */ GifViewSavedState(android.os.Parcel r1, pl.droidsonroids.gif.GifViewSavedState.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    GifViewSavedState(android.os.Parcelable r2, long[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            long[][] r2 = new long[r2][]
            r1.a = r2
            r0 = 0
            r2[r0] = r3
            return
    }

    GifViewSavedState(android.os.Parcelable r3, android.graphics.drawable.Drawable... r4) {
            r2 = this;
            r2.<init>(r3)
            int r3 = r4.length
            long[][] r3 = new long[r3][]
            r2.a = r3
            r3 = 0
        L9:
            int r0 = r4.length
            if (r3 >= r0) goto L27
            r0 = r4[r3]
            boolean r1 = r0 instanceof pl.droidsonroids.gif.e
            if (r1 == 0) goto L1f
            long[][] r1 = r2.a
            pl.droidsonroids.gif.e r0 = (pl.droidsonroids.gif.e) r0
            pl.droidsonroids.gif.GifInfoHandle r0 = r0.g
            long[] r0 = r0.o()
            r1[r3] = r0
            goto L24
        L1f:
            long[][] r0 = r2.a
            r1 = 0
            r0[r3] = r1
        L24:
            int r3 = r3 + 1
            goto L9
        L27:
            return
    }

    void a(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            long[][] r0 = r2.a
            r4 = r0[r4]
            if (r4 == 0) goto L18
            boolean r0 = r3 instanceof pl.droidsonroids.gif.e
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.e r3 = (pl.droidsonroids.gif.e) r3
            pl.droidsonroids.gif.GifInfoHandle r0 = r3.g
            android.graphics.Bitmap r1 = r3.f
            int r4 = r0.E(r4, r1)
            long r0 = (long) r4
            r3.J(r0)
        L18:
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            super.writeToParcel(r4, r5)
            long[][] r5 = r3.a
            int r5 = r5.length
            r4.writeInt(r5)
            long[][] r5 = r3.a
            int r0 = r5.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            r4.writeLongArray(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return
    }
}
