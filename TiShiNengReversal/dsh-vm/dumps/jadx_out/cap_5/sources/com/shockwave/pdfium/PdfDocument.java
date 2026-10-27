package com.shockwave.pdfium;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PdfDocument {
    long a;
    android.os.ParcelFileDescriptor b;
    final java.util.Map<java.lang.Integer, java.lang.Long> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Bookmark {
        private java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> a;
        java.lang.String b;
        long c;
        long d;

        public Bookmark() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.a = r0
                return
        }

        public java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> a() {
                r1 = this;
                java.util.List<com.shockwave.pdfium.PdfDocument$Bookmark> r0 = r1.a
                return r0
        }

        public long b() {
                r2 = this;
                long r0 = r2.c
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public boolean d() {
                r1 = this;
                java.util.List<com.shockwave.pdfium.PdfDocument$Bookmark> r0 = r1.a
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Link {
        private android.graphics.RectF a;
        private java.lang.Integer b;
        private java.lang.String c;

        public Link(android.graphics.RectF r1, java.lang.Integer r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public android.graphics.RectF a() {
                r1 = this;
                android.graphics.RectF r0 = r1.a
                return r0
        }

        public java.lang.Integer b() {
                r1 = this;
                java.lang.Integer r0 = r1.b
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Meta {
        java.lang.String a;
        java.lang.String b;
        java.lang.String c;
        java.lang.String d;
        java.lang.String e;
        java.lang.String f;
        java.lang.String g;
        java.lang.String h;

        public Meta() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.g
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.e
                return r0
        }

        public java.lang.String d() {
                r1 = this;
                java.lang.String r0 = r1.d
                return r0
        }

        public java.lang.String e() {
                r1 = this;
                java.lang.String r0 = r1.h
                return r0
        }

        public java.lang.String f() {
                r1 = this;
                java.lang.String r0 = r1.f
                return r0
        }

        public java.lang.String g() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }

        public java.lang.String h() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    PdfDocument() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.c = r0
            return
    }

    public boolean a(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = r1.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
