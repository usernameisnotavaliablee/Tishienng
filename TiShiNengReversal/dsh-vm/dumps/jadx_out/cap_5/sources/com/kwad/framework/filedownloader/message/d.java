package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d extends com.kwad.framework.filedownloader.message.MessageSnapshot {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.kwad.framework.filedownloader.message.d.b implements com.kwad.framework.filedownloader.message.b {
        a(int r1, boolean r2, long r3) {
                r0 = this;
                r2 = 1
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.kwad.framework.filedownloader.message.d {
        private final boolean aoF;
        private final long totalBytes;

        b(int r1, boolean r2, long r3) {
                r0 = this;
                r0.<init>(r1)
                r0.aoF = r2
                r0.totalBytes = r3
                return
        }

        b(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                byte r0 = r3.readByte()
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r2.aoF = r0
                long r0 = r3.readLong()
                r2.totalBytes = r0
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                boolean r4 = r2.aoF
                r3.writeByte(r4)
                long r0 = r2.totalBytes
                r3.writeLong(r0)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yO() {
                r2 = this;
                long r0 = r2.totalBytes
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean yP() {
                r1 = this;
                boolean r0 = r1.aoF
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends com.kwad.framework.filedownloader.message.d {
        private final java.lang.String anc;
        private final boolean aoG;
        private final java.lang.String fileName;
        private final long totalBytes;

        c(int r1, boolean r2, long r3, java.lang.String r5, java.lang.String r6) {
                r0 = this;
                r0.<init>(r1)
                r0.aoG = r2
                r0.totalBytes = r3
                r0.anc = r5
                r0.fileName = r6
                return
        }

        c(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                byte r0 = r3.readByte()
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r2.aoG = r0
                long r0 = r3.readLong()
                r2.totalBytes = r0
                java.lang.String r0 = r3.readString()
                r2.anc = r0
                java.lang.String r3 = r3.readString()
                r2.fileName = r3
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.String getEtag() {
                r1 = this;
                java.lang.String r0 = r1.anc
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.String getFileName() {
                r1 = this;
                java.lang.String r0 = r1.fileName
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                boolean r4 = r2.aoG
                r3.writeByte(r4)
                long r0 = r2.totalBytes
                r3.writeLong(r0)
                java.lang.String r4 = r2.anc
                r3.writeString(r4)
                java.lang.String r4 = r2.fileName
                r3.writeString(r4)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean yE() {
                r1 = this;
                boolean r0 = r1.aoG
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yO() {
                r2 = this;
                long r0 = r2.totalBytes
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.framework.filedownloader.message.d$d, reason: collision with other inner class name */
    public static class C0118d extends com.kwad.framework.filedownloader.message.d {
        private final long aoH;
        private final java.lang.Throwable aoI;

        C0118d(int r1, long r2, java.lang.Throwable r4) {
                r0 = this;
                r0.<init>(r1)
                r0.aoH = r2
                r0.aoI = r4
                return
        }

        C0118d(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                long r0 = r3.readLong()
                r2.aoH = r0
                java.io.Serializable r3 = r3.readSerializable()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.aoI = r3
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public byte wJ() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                long r0 = r2.aoH
                r3.writeLong(r0)
                java.lang.Throwable r4 = r2.aoI
                r3.writeSerializable(r4)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yQ() {
                r2 = this;
                long r0 = r2.aoH
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.Throwable yR() {
                r1 = this;
                java.lang.Throwable r0 = r1.aoI
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e extends com.kwad.framework.filedownloader.message.d.f {
        e(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends com.kwad.framework.filedownloader.message.d {
        private final long aoH;
        private final long totalBytes;

        f(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r1)
                r0.aoH = r2
                r0.totalBytes = r4
                return
        }

        f(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                long r0 = r3.readLong()
                r2.aoH = r0
                long r0 = r3.readLong()
                r2.totalBytes = r0
                return
        }

        f(com.kwad.framework.filedownloader.message.d.f r7) {
                r6 = this;
                int r1 = r7.getId()
                long r2 = r7.yQ()
                long r4 = r7.yO()
                r0 = r6
                r0.<init>(r1, r2, r4)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public byte wJ() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                long r0 = r2.aoH
                r3.writeLong(r0)
                long r0 = r2.totalBytes
                r3.writeLong(r0)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yO() {
                r2 = this;
                long r0 = r2.totalBytes
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yQ() {
                r2 = this;
                long r0 = r2.aoH
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class g extends com.kwad.framework.filedownloader.message.d {
        private final long aoH;

        g(int r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.aoH = r2
                return
        }

        g(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                long r0 = r3.readLong()
                r2.aoH = r0
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                long r0 = r2.aoH
                r3.writeLong(r0)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long yQ() {
                r2 = this;
                long r0 = r2.aoH
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class h extends com.kwad.framework.filedownloader.message.d.C0118d {
        private final int aon;

        h(int r1, long r2, java.lang.Throwable r4, int r5) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                r0.aon = r5
                return
        }

        h(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.aon = r1
                return
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0118d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0118d, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 5
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int wN() {
                r1 = this;
                int r0 = r1.aon
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0118d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.aon
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class i extends com.kwad.framework.filedownloader.message.d.j implements com.kwad.framework.filedownloader.message.b {
        i(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class j extends com.kwad.framework.filedownloader.message.d.f implements com.kwad.framework.filedownloader.message.MessageSnapshot.a {
        j(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }

        j(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -4
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot.a
        public final com.kwad.framework.filedownloader.message.MessageSnapshot yS() {
                r1 = this;
                com.kwad.framework.filedownloader.message.d$f r0 = new com.kwad.framework.filedownloader.message.d$f
                r0.<init>(r1)
                return r0
        }
    }

    d(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.aoJ = r1
            return
    }

    d(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int yM() {
            r5 = this;
            long r0 = r5.yQ()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Lf:
            long r0 = r5.yQ()
            int r1 = (int) r0
            return r1
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int yN() {
            r5 = this;
            long r0 = r5.yO()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Lf:
            long r0 = r5.yO()
            int r1 = (int) r0
            return r1
    }
}
