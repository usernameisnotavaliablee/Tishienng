package com.bytedance.adsdk.ugeno.flexbox;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FlexboxLayout extends android.view.ViewGroup implements com.bytedance.adsdk.ugeno.flexbox.j {
    private android.graphics.drawable.Drawable ae;
    private java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> av;
    private com.bytedance.adsdk.ugeno.flexbox.r az;
    private int cw;
    private int g;
    private com.bytedance.adsdk.ugeno.cw i;
    private int j;
    private int[] jy;

    /* renamed from: m, reason: collision with root package name */
    private int f1938m;
    private int oq;
    private int qv;

    /* renamed from: r, reason: collision with root package name */
    private int f1939r;
    private android.graphics.drawable.Drawable tl;
    private int up;
    private int vl;

    /* renamed from: w, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.flexbox.r.j f1940w;
    private android.util.SparseIntArray ws;
    private int xt;

    public static class j extends android.view.ViewGroup.MarginLayoutParams implements com.bytedance.adsdk.ugeno.flexbox.xt {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j> CREATOR = null;
        private int ae;
        private float cw;
        private int g;
        private int j;

        /* renamed from: m, reason: collision with root package name */
        private int f1941m;
        private boolean oq;

        /* renamed from: r, reason: collision with root package name */
        private int f1942r;
        private int tl;
        private float up;
        private float xt;


        static {
                com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j$1 r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j$1
                r0.<init>()
                com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j.CREATOR = r0
                return
        }

        public j(int r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
                r0.<init>(r2, r3)
                r1.<init>(r0)
                r2 = 1
                r1.j = r2
                r2 = 0
                r1.xt = r2
                r1.cw = r2
                r2 = -1
                r1.f1942r = r2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.up = r3
                r1.f1941m = r2
                r1.ae = r2
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                r1.tl = r2
                r1.g = r2
                return
        }

        protected j(android.os.Parcel r5) {
                r4 = this;
                r0 = 0
                r4.<init>(r0, r0)
                r1 = 1
                r4.j = r1
                r2 = 0
                r4.xt = r2
                r4.cw = r2
                r2 = -1
                r4.f1942r = r2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.up = r3
                r4.f1941m = r2
                r4.ae = r2
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                r4.tl = r2
                r4.g = r2
                int r2 = r5.readInt()
                r4.j = r2
                float r2 = r5.readFloat()
                r4.xt = r2
                float r2 = r5.readFloat()
                r4.cw = r2
                int r2 = r5.readInt()
                r4.f1942r = r2
                float r2 = r5.readFloat()
                r4.up = r2
                int r2 = r5.readInt()
                r4.f1941m = r2
                int r2 = r5.readInt()
                r4.ae = r2
                int r2 = r5.readInt()
                r4.tl = r2
                int r2 = r5.readInt()
                r4.g = r2
                byte r2 = r5.readByte()
                if (r2 == 0) goto L5b
                r0 = 1
            L5b:
                r4.oq = r0
                int r0 = r5.readInt()
                r4.bottomMargin = r0
                int r0 = r5.readInt()
                r4.leftMargin = r0
                int r0 = r5.readInt()
                r4.rightMargin = r0
                int r0 = r5.readInt()
                r4.topMargin = r0
                int r0 = r5.readInt()
                r4.height = r0
                int r5 = r5.readInt()
                r4.width = r5
                return
        }

        public j(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 1
                r1.j = r2
                r2 = 0
                r1.xt = r2
                r1.cw = r2
                r2 = -1
                r1.f1942r = r2
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.up = r0
                r1.f1941m = r2
                r1.ae = r2
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                r1.tl = r2
                r1.g = r2
                return
        }

        public j(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 1
                r1.j = r2
                r2 = 0
                r1.xt = r2
                r1.cw = r2
                r2 = -1
                r1.f1942r = r2
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.up = r0
                r1.f1941m = r2
                r1.ae = r2
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                r1.tl = r2
                r1.g = r2
                return
        }

        public j(com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 1
                r2.j = r0
                r0 = 0
                r2.xt = r0
                r2.cw = r0
                r0 = -1
                r2.f1942r = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r2.up = r1
                r2.f1941m = r0
                r2.ae = r0
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                r2.tl = r0
                r2.g = r0
                int r0 = r3.j
                r2.j = r0
                float r0 = r3.xt
                r2.xt = r0
                float r0 = r3.cw
                r2.cw = r0
                int r0 = r3.f1942r
                r2.f1942r = r0
                float r0 = r3.up
                r2.up = r0
                int r0 = r3.f1941m
                r2.f1941m = r0
                int r0 = r3.ae
                r2.ae = r0
                int r0 = r3.tl
                r2.tl = r0
                int r0 = r3.g
                r2.g = r0
                boolean r3 = r3.oq
                r2.oq = r3
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int ae() {
                r1 = this;
                int r0 = r1.f1941m
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int av() {
                r1 = this;
                int r0 = r1.bottomMargin
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int az() {
                r1 = this;
                int r0 = r1.rightMargin
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int cw() {
                r1 = this;
                int r0 = r1.j
                return r0
        }

        public void cw(float r1) {
                r0 = this;
                r0.up = r1
                return
        }

        public void cw(int r1) {
                r0 = this;
                r0.j = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int g() {
                r1 = this;
                int r0 = r1.tl
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int j() {
                r1 = this;
                int r0 = r1.width
                return r0
        }

        public void j(float r1) {
                r0 = this;
                r0.xt = r1
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public void j(int r1) {
                r0 = this;
                r0.f1941m = r1
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int jy() {
                r1 = this;
                int r0 = r1.leftMargin
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int m() {
                r1 = this;
                int r0 = r1.f1942r
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int oq() {
                r1 = this;
                int r0 = r1.g
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public boolean qv() {
                r1 = this;
                boolean r0 = r1.oq
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public float r() {
                r1 = this;
                float r0 = r1.xt
                return r0
        }

        public void r(int r1) {
                r0 = this;
                r0.f1942r = r1
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int tl() {
                r1 = this;
                int r0 = r1.ae
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public float up() {
                r1 = this;
                float r0 = r1.cw
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public float vl() {
                r1 = this;
                float r0 = r1.up
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.j
                r1.writeInt(r2)
                float r2 = r0.xt
                r1.writeFloat(r2)
                float r2 = r0.cw
                r1.writeFloat(r2)
                int r2 = r0.f1942r
                r1.writeInt(r2)
                float r2 = r0.up
                r1.writeFloat(r2)
                int r2 = r0.f1941m
                r1.writeInt(r2)
                int r2 = r0.ae
                r1.writeInt(r2)
                int r2 = r0.tl
                r1.writeInt(r2)
                int r2 = r0.g
                r1.writeInt(r2)
                boolean r2 = r0.oq
                r1.writeByte(r2)
                int r2 = r0.bottomMargin
                r1.writeInt(r2)
                int r2 = r0.leftMargin
                r1.writeInt(r2)
                int r2 = r0.rightMargin
                r1.writeInt(r2)
                int r2 = r0.topMargin
                r1.writeInt(r2)
                int r2 = r0.height
                r1.writeInt(r2)
                int r2 = r0.width
                r1.writeInt(r2)
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int ws() {
                r1 = this;
                int r0 = r1.topMargin
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public int xt() {
                r1 = this;
                int r0 = r1.height
                return r0
        }

        public void xt(float r1) {
                r0 = this;
                r0.cw = r1
                return
        }

        @Override // com.bytedance.adsdk.ugeno.flexbox.xt
        public void xt(int r1) {
                r0 = this;
                r0.ae = r1
                return
        }
    }

    public FlexboxLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r2 = -1
            r1.f1938m = r2
            com.bytedance.adsdk.ugeno.flexbox.r r2 = new com.bytedance.adsdk.ugeno.flexbox.r
            r2.<init>(r1)
            r1.az = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.av = r2
            com.bytedance.adsdk.ugeno.flexbox.r$j r2 = new com.bytedance.adsdk.ugeno.flexbox.r$j
            r2.<init>()
            r1.f1940w = r2
            return
    }

    private void cw(int r4, int r5) {
            r3 = this;
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r3.av
            r0.clear()
            com.bytedance.adsdk.ugeno.flexbox.r$j r0 = r3.f1940w
            r0.j()
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r3.az
            com.bytedance.adsdk.ugeno.flexbox.r$j r1 = r3.f1940w
            r0.xt(r1, r4, r5)
            com.bytedance.adsdk.ugeno.flexbox.r$j r0 = r3.f1940w
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r0.j
            r3.av = r0
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r3.az
            r0.j(r4, r5)
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r3.az
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            r0.xt(r4, r5, r1)
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r3.az
            r0.j()
            int r0 = r3.j
            com.bytedance.adsdk.ugeno.flexbox.r$j r1 = r3.f1940w
            int r1 = r1.xt
            r3.j(r0, r4, r5, r1)
            return
    }

    private void j(int r3, int r4) {
            r2 = this;
            android.util.SparseIntArray r0 = r2.ws
            if (r0 != 0) goto Lf
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            int r1 = r2.getChildCount()
            r0.<init>(r1)
            r2.ws = r0
        Lf:
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r2.az
            android.util.SparseIntArray r1 = r2.ws
            boolean r0 = r0.xt(r1)
            if (r0 == 0) goto L23
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r2.az
            android.util.SparseIntArray r1 = r2.ws
            int[] r0 = r0.j(r1)
            r2.jy = r0
        L23:
            int r0 = r2.j
            if (r0 == 0) goto L4b
            r1 = 1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L47
            r1 = 3
            if (r0 != r1) goto L31
            goto L47
        L31:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid value for the flex direction is set: "
            r4.<init>(r0)
            int r0 = r2.j
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L47:
            r2.cw(r3, r4)
            return
        L4b:
            r2.xt(r3, r4)
            return
    }

    private void j(int r9, int r10, int r11, int r12) {
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            int r2 = android.view.View.MeasureSpec.getMode(r11)
            int r3 = android.view.View.MeasureSpec.getSize(r11)
            if (r9 == 0) goto L3f
            r4 = 1
            if (r9 == r4) goto L3f
            r4 = 2
            if (r9 == r4) goto L2c
            r4 = 3
            if (r9 != r4) goto L1c
            goto L2c
        L1c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid flex direction: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        L2c:
            int r9 = r8.getLargestMainSize()
            int r4 = r8.getSumOfCrossSize()
            int r5 = r8.getPaddingLeft()
            int r4 = r4 + r5
            int r5 = r8.getPaddingRight()
            int r4 = r4 + r5
            goto L51
        L3f:
            int r9 = r8.getSumOfCrossSize()
            int r4 = r8.getPaddingTop()
            int r9 = r9 + r4
            int r4 = r8.getPaddingBottom()
            int r9 = r9 + r4
            int r4 = r8.getLargestMainSize()
        L51:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L7d
            if (r0 == 0) goto L78
            if (r0 != r6) goto L68
            if (r1 >= r4) goto L63
            int r12 = android.view.View.combineMeasuredStates(r12, r5)
        L63:
            int r10 = android.view.View.resolveSizeAndState(r1, r10, r12)
            goto L89
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Unknown width mode is set: "
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r10.concat(r11)
            r9.<init>(r10)
            throw r9
        L78:
            int r10 = android.view.View.resolveSizeAndState(r4, r10, r12)
            goto L89
        L7d:
            if (r1 >= r4) goto L84
            int r12 = android.view.View.combineMeasuredStates(r12, r5)
            goto L85
        L84:
            r1 = r4
        L85:
            int r10 = android.view.View.resolveSizeAndState(r1, r10, r12)
        L89:
            r0 = 256(0x100, float:3.59E-43)
            if (r2 == r7) goto Lb1
            if (r2 == 0) goto Lac
            if (r2 != r6) goto L9c
            if (r3 >= r9) goto L97
            int r12 = android.view.View.combineMeasuredStates(r12, r0)
        L97:
            int r9 = android.view.View.resolveSizeAndState(r3, r11, r12)
            goto Lbd
        L9c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Unknown height mode is set: "
            java.lang.String r11 = java.lang.String.valueOf(r2)
            java.lang.String r10 = r10.concat(r11)
            r9.<init>(r10)
            throw r9
        Lac:
            int r9 = android.view.View.resolveSizeAndState(r9, r11, r12)
            goto Lbd
        Lb1:
            if (r3 >= r9) goto Lb8
            int r12 = android.view.View.combineMeasuredStates(r12, r0)
            goto Lb9
        Lb8:
            r3 = r9
        Lb9:
            int r9 = android.view.View.resolveSizeAndState(r3, r11, r12)
        Lbd:
            r8.setMeasuredDimension(r10, r9)
            return
    }

    private void j(android.graphics.Canvas r3, int r4, int r5, int r6) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.tl
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r2.vl
            int r1 = r1 + r4
            int r6 = r6 + r5
            r0.setBounds(r4, r5, r1, r6)
            android.graphics.drawable.Drawable r4 = r2.tl
            r4.draw(r3)
            return
    }

    private void j(android.graphics.Canvas r13, boolean r14, boolean r15) {
            r12 = this;
            int r0 = r12.getPaddingLeft()
            int r1 = r12.getPaddingRight()
            int r2 = r12.getWidth()
            int r2 = r2 - r1
            int r2 = r2 - r0
            r1 = 0
            int r2 = java.lang.Math.max(r1, r2)
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r3 = r12.av
            int r3 = r3.size()
            r4 = 0
        L1a:
            if (r4 >= r3) goto Lbb
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r5 = r12.av
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.flexbox.cw r5 = (com.bytedance.adsdk.ugeno.flexbox.cw) r5
            r6 = 0
        L25:
            int r7 = r5.tl
            if (r6 >= r7) goto L8b
            int r7 = r5.az
            int r7 = r7 + r6
            android.view.View r8 = r12.cw(r7)
            if (r8 == 0) goto L88
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 == r10) goto L88
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r9 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r9
            boolean r7 = r12.r(r7, r6)
            if (r7 == 0) goto L61
            if (r14 == 0) goto L50
            int r7 = r8.getRight()
            int r10 = r9.rightMargin
            int r7 = r7 + r10
            goto L5a
        L50:
            int r7 = r8.getLeft()
            int r10 = r9.leftMargin
            int r7 = r7 - r10
            int r10 = r12.vl
            int r7 = r7 - r10
        L5a:
            int r10 = r5.xt
            int r11 = r5.ae
            r12.j(r13, r7, r10, r11)
        L61:
            int r7 = r5.tl
            int r7 = r7 + (-1)
            if (r6 != r7) goto L88
            int r7 = r12.oq
            r7 = r7 & 4
            if (r7 <= 0) goto L88
            if (r14 == 0) goto L7a
            int r7 = r8.getLeft()
            int r8 = r9.leftMargin
            int r7 = r7 - r8
            int r8 = r12.vl
            int r7 = r7 - r8
            goto L81
        L7a:
            int r7 = r8.getRight()
            int r8 = r9.rightMargin
            int r7 = r7 + r8
        L81:
            int r8 = r5.xt
            int r9 = r5.ae
            r12.j(r13, r7, r8, r9)
        L88:
            int r6 = r6 + 1
            goto L25
        L8b:
            boolean r6 = r12.r(r4)
            if (r6 == 0) goto L9e
            if (r15 == 0) goto L96
            int r6 = r5.f1944r
            goto L9b
        L96:
            int r6 = r5.xt
            int r7 = r12.qv
            int r6 = r6 - r7
        L9b:
            r12.xt(r13, r0, r6, r2)
        L9e:
            boolean r6 = r12.m(r4)
            if (r6 == 0) goto Lb7
            int r6 = r12.g
            r6 = r6 & 4
            if (r6 <= 0) goto Lb7
            if (r15 == 0) goto Lb2
            int r5 = r5.xt
            int r6 = r12.qv
            int r5 = r5 - r6
            goto Lb4
        Lb2:
            int r5 = r5.f1944r
        Lb4:
            r12.xt(r13, r0, r5, r2)
        Lb7:
            int r4 = r4 + 1
            goto L1a
        Lbb:
            return
    }

    private void j(boolean r25, int r26, int r27, int r28, int r29) {
            r24 = this;
            r0 = r24
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r29 - r27
            int r4 = r28 - r26
            int r5 = r0.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r0.getPaddingTop()
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r6 = r0.av
            int r6 = r6.size()
            r8 = 0
        L1e:
            if (r8 >= r6) goto L204
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r9 = r0.av
            java.lang.Object r9 = r9.get(r8)
            r12 = r9
            com.bytedance.adsdk.ugeno.flexbox.cw r12 = (com.bytedance.adsdk.ugeno.flexbox.cw) r12
            boolean r9 = r0.r(r8)
            if (r9 == 0) goto L33
            int r9 = r0.qv
            int r3 = r3 - r9
            int r5 = r5 + r9
        L33:
            r16 = r3
            int r3 = r0.cw
            r9 = 4
            r10 = 2
            r11 = 0
            r13 = 1
            if (r3 == 0) goto Lc7
            if (r3 == r13) goto Lbd
            r14 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto Lab
            r15 = 3
            if (r3 == r15) goto L94
            if (r3 == r9) goto L7a
            r14 = 5
            if (r3 != r14) goto L64
            int r3 = r12.xt()
            if (r3 == 0) goto L5b
            int r14 = r12.up
            int r14 = r4 - r14
            float r14 = (float) r14
            int r3 = r3 + 1
            float r3 = (float) r3
            float r14 = r14 / r3
            goto L5c
        L5b:
            r14 = 0
        L5c:
            float r3 = (float) r1
            float r3 = r3 + r14
            int r15 = r4 - r2
            float r15 = (float) r15
            float r15 = r15 - r14
            goto Lcc
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.cw
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L7a:
            int r3 = r12.xt()
            if (r3 == 0) goto L88
            int r15 = r12.up
            int r15 = r4 - r15
            float r15 = (float) r15
            float r3 = (float) r3
            float r15 = r15 / r3
            goto L89
        L88:
            r15 = 0
        L89:
            float r3 = (float) r1
            float r14 = r15 / r14
            float r3 = r3 + r14
            int r7 = r4 - r2
            float r7 = (float) r7
            float r7 = r7 - r14
            r14 = r15
            r15 = r7
            goto Lcc
        L94:
            float r3 = (float) r1
            int r7 = r12.xt()
            if (r7 == r13) goto L9f
            int r7 = r7 + (-1)
            float r7 = (float) r7
            goto La1
        L9f:
            r7 = 1065353216(0x3f800000, float:1.0)
        La1:
            int r14 = r12.up
            int r14 = r4 - r14
            float r14 = (float) r14
            float r14 = r14 / r7
            int r7 = r4 - r2
            float r15 = (float) r7
            goto Lcc
        Lab:
            float r3 = (float) r1
            int r7 = r12.up
            int r15 = r4 - r7
            float r15 = (float) r15
            float r15 = r15 / r14
            float r3 = r3 + r15
            int r15 = r4 - r2
            float r15 = (float) r15
            int r7 = r4 - r7
            float r7 = (float) r7
            float r7 = r7 / r14
            float r15 = r15 - r7
        Lbb:
            r14 = 0
            goto Lcc
        Lbd:
            int r3 = r12.up
            int r7 = r4 - r3
            int r7 = r7 + r2
            float r7 = (float) r7
            int r3 = r3 - r1
            float r15 = (float) r3
            r3 = r7
            goto Lbb
        Lc7:
            float r3 = (float) r1
            int r7 = r4 - r2
            float r15 = (float) r7
            goto Lbb
        Lcc:
            float r7 = java.lang.Math.max(r14, r11)
            r11 = 0
        Ld1:
            int r14 = r12.tl
            if (r11 >= r14) goto L1f9
            int r14 = r12.az
            int r14 = r14 + r11
            android.view.View r17 = r0.cw(r14)
            r27 = 4
            if (r17 == 0) goto L1e8
            int r9 = r17.getVisibility()
            r28 = 1
            r13 = 8
            if (r9 == r13) goto L1e8
            android.view.ViewGroup$LayoutParams r9 = r17.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r9 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r9
            int r13 = r9.leftMargin
            float r13 = (float) r13
            float r3 = r3 + r13
            int r13 = r9.rightMargin
            float r13 = (float) r13
            float r15 = r15 - r13
            boolean r13 = r0.r(r14, r11)
            if (r13 == 0) goto L108
            int r13 = r0.vl
            float r14 = (float) r13
            float r3 = r3 + r14
            float r15 = r15 - r14
            r18 = r13
        L105:
            r19 = r15
            goto L10b
        L108:
            r18 = 0
            goto L105
        L10b:
            int r13 = r12.tl
            int r13 = r13 + (-1)
            if (r11 != r13) goto L11c
            int r13 = r0.oq
            r13 = r13 & 4
            if (r13 <= 0) goto L11c
            int r13 = r0.vl
            r20 = r13
            goto L11e
        L11c:
            r20 = 0
        L11e:
            int r13 = r0.xt
            if (r13 != r10) goto L170
            if (r25 == 0) goto L14c
            r13 = 2
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r14 = java.lang.Math.round(r19)
            int r15 = r17.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r17.getMeasuredHeight()
            int r15 = r16 - r15
            r13 = r14
            r14 = r15
            r21 = 2
            int r15 = java.lang.Math.round(r19)
            r22 = r17
            r17 = r11
            r11 = r22
            r22 = 1
            r10.j(r11, r12, r13, r14, r15, r16)
        L149:
            r23 = r16
            goto L1b2
        L14c:
            r21 = r17
            r17 = r11
            r11 = r21
            r21 = 2
            r22 = 1
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r13 = java.lang.Math.round(r3)
            int r14 = r11.getMeasuredHeight()
            int r14 = r16 - r14
            int r15 = java.lang.Math.round(r3)
            int r23 = r11.getMeasuredWidth()
            int r15 = r15 + r23
            r10.j(r11, r12, r13, r14, r15, r16)
            goto L149
        L170:
            r21 = r17
            r17 = r11
            r11 = r21
            r23 = r16
            r21 = 2
            r22 = 1
            if (r25 == 0) goto L198
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r13 = java.lang.Math.round(r19)
            int r14 = r11.getMeasuredWidth()
            int r13 = r13 - r14
            int r15 = java.lang.Math.round(r19)
            int r14 = r11.getMeasuredHeight()
            int r16 = r5 + r14
            r14 = r5
            r10.j(r11, r12, r13, r14, r15, r16)
            goto L1b2
        L198:
            r14 = r5
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r13 = java.lang.Math.round(r3)
            int r5 = java.lang.Math.round(r3)
            int r15 = r11.getMeasuredWidth()
            int r15 = r15 + r5
            int r5 = r11.getMeasuredHeight()
            int r16 = r14 + r5
            r10.j(r11, r12, r13, r14, r15, r16)
            r5 = r14
        L1b2:
            int r10 = r11.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r13 = r9.rightMargin
            float r13 = (float) r13
            float r10 = r10 + r13
            float r3 = r3 + r10
            int r10 = r11.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r9 = r9.leftMargin
            float r9 = (float) r9
            float r10 = r10 + r9
            float r19 = r19 - r10
            if (r25 == 0) goto L1d7
            r13 = 0
            r15 = 0
            r10 = r12
            r14 = r18
            r12 = r20
            r10.j(r11, r12, r13, r14, r15)
        L1d5:
            r12 = r10
            goto L1e5
        L1d7:
            r14 = r18
            r13 = r20
            r9 = 0
            r15 = 0
            r10 = r12
            r12 = r14
            r14 = r13
            r13 = 0
            r10.j(r11, r12, r13, r14, r15)
            goto L1d5
        L1e5:
            r15 = r19
            goto L1f0
        L1e8:
            r17 = r11
            r23 = r16
            r21 = 2
            r22 = 1
        L1f0:
            int r11 = r17 + 1
            r16 = r23
            r9 = 4
            r10 = 2
            r13 = 1
            goto Ld1
        L1f9:
            r23 = r16
            int r3 = r12.ae
            int r5 = r5 + r3
            int r3 = r23 - r3
            int r8 = r8 + 1
            goto L1e
        L204:
            return
    }

    private void j(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
            r24 = this;
            r0 = r24
            int r1 = r0.getPaddingTop()
            int r2 = r0.getPaddingBottom()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingLeft()
            int r5 = r29 - r27
            int r6 = r30 - r28
            int r5 = r5 - r3
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r3 = r0.av
            int r3 = r3.size()
            r8 = 0
        L1e:
            if (r8 >= r3) goto L1f0
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r9 = r0.av
            java.lang.Object r9 = r9.get(r8)
            r12 = r9
            com.bytedance.adsdk.ugeno.flexbox.cw r12 = (com.bytedance.adsdk.ugeno.flexbox.cw) r12
            boolean r9 = r0.r(r8)
            if (r9 == 0) goto L33
            int r9 = r0.vl
            int r4 = r4 + r9
            int r5 = r5 - r9
        L33:
            r16 = r5
            int r5 = r0.cw
            r9 = 4
            r10 = 0
            r11 = 1
            if (r5 == 0) goto Lc7
            if (r5 == r11) goto Lbd
            r13 = 2
            r14 = 1073741824(0x40000000, float:2.0)
            if (r5 == r13) goto Laa
            r13 = 3
            if (r5 == r13) goto L92
            if (r5 == r9) goto L79
            r13 = 5
            if (r5 != r13) goto L63
            int r5 = r12.xt()
            if (r5 == 0) goto L5b
            int r13 = r12.up
            int r13 = r6 - r13
            float r13 = (float) r13
            int r5 = r5 + 1
            float r5 = (float) r5
            float r13 = r13 / r5
            goto L5c
        L5b:
            r13 = 0
        L5c:
            float r5 = (float) r1
            float r5 = r5 + r13
            int r14 = r6 - r2
            float r14 = (float) r14
            float r14 = r14 - r13
            goto Lcc
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.cw
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L79:
            int r5 = r12.xt()
            if (r5 == 0) goto L87
            int r13 = r12.up
            int r13 = r6 - r13
            float r13 = (float) r13
            float r5 = (float) r5
            float r13 = r13 / r5
            goto L88
        L87:
            r13 = 0
        L88:
            float r5 = (float) r1
            float r14 = r13 / r14
            float r5 = r5 + r14
            int r15 = r6 - r2
            float r15 = (float) r15
            float r14 = r15 - r14
            goto Lcc
        L92:
            float r5 = (float) r1
            int r13 = r12.xt()
            if (r13 == r11) goto L9d
            int r13 = r13 + (-1)
            float r13 = (float) r13
            goto L9f
        L9d:
            r13 = 1065353216(0x3f800000, float:1.0)
        L9f:
            int r14 = r12.up
            int r14 = r6 - r14
            float r14 = (float) r14
            float r13 = r14 / r13
            int r14 = r6 - r2
            float r14 = (float) r14
            goto Lcc
        Laa:
            float r5 = (float) r1
            int r13 = r12.up
            int r15 = r6 - r13
            float r15 = (float) r15
            float r15 = r15 / r14
            float r5 = r5 + r15
            int r15 = r6 - r2
            float r15 = (float) r15
            int r13 = r6 - r13
            float r13 = (float) r13
            float r13 = r13 / r14
            float r14 = r15 - r13
        Lbb:
            r13 = 0
            goto Lcc
        Lbd:
            int r5 = r12.up
            int r13 = r6 - r5
            int r13 = r13 + r2
            float r13 = (float) r13
            int r5 = r5 - r1
            float r14 = (float) r5
            r5 = r13
            goto Lbb
        Lc7:
            float r5 = (float) r1
            int r13 = r6 - r2
            float r14 = (float) r13
            goto Lbb
        Lcc:
            float r18 = java.lang.Math.max(r13, r10)
            r10 = 0
        Ld1:
            int r13 = r12.tl
            if (r10 >= r13) goto L1e5
            int r13 = r12.az
            int r13 = r13 + r10
            r15 = 1
            android.view.View r11 = r0.cw(r13)
            if (r11 == 0) goto L1da
            int r7 = r11.getVisibility()
            r28 = 4
            r9 = 8
            if (r7 == r9) goto L1d3
            android.view.ViewGroup$LayoutParams r7 = r11.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r7 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r7
            int r9 = r7.topMargin
            float r9 = (float) r9
            float r5 = r5 + r9
            int r9 = r7.bottomMargin
            float r9 = (float) r9
            float r14 = r14 - r9
            boolean r9 = r0.r(r13, r10)
            if (r9 == 0) goto L105
            int r9 = r0.qv
            float r13 = (float) r9
            float r5 = r5 + r13
            float r14 = r14 - r13
        L102:
            r19 = r14
            goto L107
        L105:
            r9 = 0
            goto L102
        L107:
            int r13 = r12.tl
            int r13 = r13 - r15
            if (r10 != r13) goto L117
            int r13 = r0.g
            r13 = r13 & 4
            if (r13 <= 0) goto L117
            int r13 = r0.qv
            r20 = r13
            goto L119
        L117:
            r20 = 0
        L119:
            if (r25 == 0) goto L160
            if (r26 == 0) goto L141
            r13 = r10
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r14 = r11.getMeasuredWidth()
            int r14 = r16 - r14
            int r17 = java.lang.Math.round(r19)
            int r21 = r11.getMeasuredHeight()
            int r17 = r17 - r21
            r15 = r17
            r21 = 1
            int r17 = java.lang.Math.round(r19)
            r22 = r13
            r13 = 1
            r10.j(r11, r12, r13, r14, r15, r16, r17)
        L13e:
            r23 = r16
            goto L1a0
        L141:
            r22 = r10
            r21 = 1
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r13 = r11.getMeasuredWidth()
            int r14 = r16 - r13
            int r15 = java.lang.Math.round(r5)
            int r13 = java.lang.Math.round(r5)
            int r17 = r11.getMeasuredHeight()
            int r17 = r13 + r17
            r13 = 1
            r10.j(r11, r12, r13, r14, r15, r16, r17)
            goto L13e
        L160:
            r22 = r10
            r23 = r16
            r21 = 1
            if (r26 == 0) goto L184
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r13 = java.lang.Math.round(r19)
            int r14 = r11.getMeasuredHeight()
            int r15 = r13 - r14
            int r13 = r11.getMeasuredWidth()
            int r16 = r4 + r13
            int r17 = java.lang.Math.round(r19)
            r13 = 0
            r14 = r4
            r10.j(r11, r12, r13, r14, r15, r16, r17)
            goto L1a0
        L184:
            r14 = r4
            com.bytedance.adsdk.ugeno.flexbox.r r10 = r0.az
            int r15 = java.lang.Math.round(r5)
            int r4 = r11.getMeasuredWidth()
            int r16 = r14 + r4
            int r4 = java.lang.Math.round(r5)
            int r13 = r11.getMeasuredHeight()
            int r17 = r4 + r13
            r13 = 0
            r10.j(r11, r12, r13, r14, r15, r16, r17)
            r4 = r14
        L1a0:
            int r10 = r11.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r18
            int r13 = r7.bottomMargin
            float r13 = (float) r13
            float r10 = r10 + r13
            float r5 = r5 + r10
            int r10 = r11.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r18
            int r7 = r7.topMargin
            float r7 = (float) r7
            float r10 = r10 + r7
            float r19 = r19 - r10
            if (r26 == 0) goto L1c6
            r10 = r12
            r12 = 0
            r14 = 0
            r15 = r9
            r13 = r20
            r10.j(r11, r12, r13, r14, r15)
        L1c4:
            r12 = r10
            goto L1d0
        L1c6:
            r13 = r9
            r10 = r12
            r15 = r20
            r12 = 0
            r14 = 0
            r10.j(r11, r12, r13, r14, r15)
            goto L1c4
        L1d0:
            r14 = r19
            goto L1dd
        L1d3:
            r22 = r10
            r23 = r16
            r21 = 1
            goto L1dd
        L1da:
            r28 = 4
            goto L1d3
        L1dd:
            int r10 = r22 + 1
            r16 = r23
            r9 = 4
            r11 = 1
            goto Ld1
        L1e5:
            r23 = r16
            int r5 = r12.ae
            int r4 = r4 + r5
            int r5 = r23 - r5
            int r8 = r8 + 1
            goto L1e
        L1f0:
            return
    }

    private boolean m(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L3d
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1 = r3.av
            int r1 = r1.size()
            if (r4 < r1) goto Lc
            goto L3d
        Lc:
            r1 = 1
            int r4 = r4 + r1
        Le:
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r2 = r3.av
            int r2 = r2.size()
            if (r4 >= r2) goto L28
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r2 = r3.av
            java.lang.Object r2 = r2.get(r4)
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = (com.bytedance.adsdk.ugeno.flexbox.cw) r2
            int r2 = r2.xt()
            if (r2 <= 0) goto L25
            return r0
        L25:
            int r4 = r4 + 1
            goto Le
        L28:
            boolean r4 = r3.j()
            if (r4 == 0) goto L36
            int r4 = r3.g
            r4 = r4 & 4
            if (r4 == 0) goto L35
            return r1
        L35:
            return r0
        L36:
            int r4 = r3.oq
            r4 = r4 & 4
            if (r4 == 0) goto L3d
            return r1
        L3d:
            return r0
    }

    private boolean r(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto L3c
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1 = r2.av
            int r1 = r1.size()
            if (r3 < r1) goto Lc
            goto L3c
        Lc:
            boolean r3 = r2.up(r3)
            r1 = 1
            if (r3 == 0) goto L27
            boolean r3 = r2.j()
            if (r3 == 0) goto L20
            int r3 = r2.g
            r3 = r3 & r1
            if (r3 == 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            int r3 = r2.oq
            r3 = r3 & r1
            if (r3 == 0) goto L26
            return r1
        L26:
            return r0
        L27:
            boolean r3 = r2.j()
            if (r3 == 0) goto L35
            int r3 = r2.g
            r3 = r3 & 2
            if (r3 == 0) goto L34
            return r1
        L34:
            return r0
        L35:
            int r3 = r2.oq
            r3 = r3 & 2
            if (r3 == 0) goto L3c
            return r1
        L3c:
            return r0
    }

    private boolean r(int r2, int r3) {
            r1 = this;
            boolean r2 = r1.up(r2, r3)
            r3 = 0
            r0 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r1.j()
            if (r2 == 0) goto L15
            int r2 = r1.oq
            r2 = r2 & r0
            if (r2 == 0) goto L14
            return r0
        L14:
            return r3
        L15:
            int r2 = r1.g
            r2 = r2 & r0
            if (r2 == 0) goto L1b
            return r0
        L1b:
            return r3
        L1c:
            boolean r2 = r1.j()
            if (r2 == 0) goto L2a
            int r2 = r1.oq
            r2 = r2 & 2
            if (r2 == 0) goto L29
            return r0
        L29:
            return r3
        L2a:
            int r2 = r1.g
            r2 = r2 & 2
            if (r2 == 0) goto L31
            return r0
        L31:
            return r3
    }

    private boolean up(int r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r4) goto L16
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r2 = r3.av
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = (com.bytedance.adsdk.ugeno.flexbox.cw) r2
            int r2 = r2.xt()
            if (r2 <= 0) goto L13
            return r0
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            r4 = 1
            return r4
    }

    private boolean up(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 1
        L2:
            if (r1 > r6) goto L19
            int r2 = r5 - r1
            android.view.View r2 = r4.cw(r2)
            if (r2 == 0) goto L16
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L16
            r5 = 0
            return r5
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r0
    }

    private void xt() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.ae
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.tl
            if (r0 != 0) goto Ld
            r0 = 1
            r1.setWillNotDraw(r0)
            return
        Ld:
            r0 = 0
            r1.setWillNotDraw(r0)
            return
    }

    private void xt(int r9, int r10) {
            r8 = this;
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r8.av
            r0.clear()
            com.bytedance.adsdk.ugeno.flexbox.r$j r0 = r8.f1940w
            r0.j()
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r8.az
            com.bytedance.adsdk.ugeno.flexbox.r$j r1 = r8.f1940w
            r0.j(r1, r9, r10)
            com.bytedance.adsdk.ugeno.flexbox.r$j r0 = r8.f1940w
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r0.j
            r8.av = r0
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r8.az
            r0.j(r9, r10)
            int r0 = r8.f1939r
            r1 = 3
            if (r0 != r1) goto L94
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r8.av
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.flexbox.cw r1 = (com.bytedance.adsdk.ugeno.flexbox.cw) r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L36:
            int r4 = r1.tl
            if (r3 >= r4) goto L91
            int r4 = r1.az
            int r4 = r4 + r3
            android.view.View r4 = r8.cw(r4)
            if (r4 == 0) goto L8e
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L8e
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r5 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r5
            int r6 = r8.xt
            r7 = 2
            if (r6 == r7) goto L70
            int r6 = r1.vl
            int r7 = r4.getBaseline()
            int r6 = r6 - r7
            int r7 = r5.topMargin
            int r6 = java.lang.Math.max(r6, r7)
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r6
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            int r2 = java.lang.Math.max(r2, r4)
            goto L8e
        L70:
            int r6 = r1.vl
            int r7 = r4.getMeasuredHeight()
            int r6 = r6 - r7
            int r7 = r4.getBaseline()
            int r6 = r6 + r7
            int r7 = r5.bottomMargin
            int r6 = java.lang.Math.max(r6, r7)
            int r4 = r4.getMeasuredHeight()
            int r5 = r5.topMargin
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r2 = java.lang.Math.max(r2, r4)
        L8e:
            int r3 = r3 + 1
            goto L36
        L91:
            r1.ae = r2
            goto L27
        L94:
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r8.az
            int r1 = r8.getPaddingTop()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 + r2
            r0.xt(r9, r10, r1)
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r8.az
            r0.j()
            int r0 = r8.j
            com.bytedance.adsdk.ugeno.flexbox.r$j r1 = r8.f1940w
            int r1 = r1.xt
            r8.j(r0, r9, r10, r1)
            return
    }

    private void xt(android.graphics.Canvas r3, int r4, int r5, int r6) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.ae
            if (r0 != 0) goto L5
            return
        L5:
            int r6 = r6 + r4
            int r1 = r2.qv
            int r1 = r1 + r5
            r0.setBounds(r4, r5, r6, r1)
            android.graphics.drawable.Drawable r4 = r2.ae
            r4.draw(r3)
            return
    }

    private void xt(android.graphics.Canvas r13, boolean r14, boolean r15) {
            r12 = this;
            int r0 = r12.getPaddingTop()
            int r1 = r12.getPaddingBottom()
            int r2 = r12.getHeight()
            int r2 = r2 - r1
            int r2 = r2 - r0
            r1 = 0
            int r2 = java.lang.Math.max(r1, r2)
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r3 = r12.av
            int r3 = r3.size()
            r4 = 0
        L1a:
            if (r4 >= r3) goto Lbb
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r5 = r12.av
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.flexbox.cw r5 = (com.bytedance.adsdk.ugeno.flexbox.cw) r5
            r6 = 0
        L25:
            int r7 = r5.tl
            if (r6 >= r7) goto L8b
            int r7 = r5.az
            int r7 = r7 + r6
            android.view.View r8 = r12.cw(r7)
            if (r8 == 0) goto L88
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 == r10) goto L88
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r9 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r9
            boolean r7 = r12.r(r7, r6)
            if (r7 == 0) goto L61
            if (r15 == 0) goto L50
            int r7 = r8.getBottom()
            int r10 = r9.bottomMargin
            int r7 = r7 + r10
            goto L5a
        L50:
            int r7 = r8.getTop()
            int r10 = r9.topMargin
            int r7 = r7 - r10
            int r10 = r12.qv
            int r7 = r7 - r10
        L5a:
            int r10 = r5.j
            int r11 = r5.ae
            r12.xt(r13, r10, r7, r11)
        L61:
            int r7 = r5.tl
            int r7 = r7 + (-1)
            if (r6 != r7) goto L88
            int r7 = r12.g
            r7 = r7 & 4
            if (r7 <= 0) goto L88
            if (r15 == 0) goto L7a
            int r7 = r8.getTop()
            int r8 = r9.topMargin
            int r7 = r7 - r8
            int r8 = r12.qv
            int r7 = r7 - r8
            goto L81
        L7a:
            int r7 = r8.getBottom()
            int r8 = r9.bottomMargin
            int r7 = r7 + r8
        L81:
            int r8 = r5.j
            int r9 = r5.ae
            r12.xt(r13, r8, r7, r9)
        L88:
            int r6 = r6 + 1
            goto L25
        L8b:
            boolean r6 = r12.r(r4)
            if (r6 == 0) goto L9e
            if (r14 == 0) goto L96
            int r6 = r5.cw
            goto L9b
        L96:
            int r6 = r5.j
            int r7 = r12.vl
            int r6 = r6 - r7
        L9b:
            r12.j(r13, r6, r0, r2)
        L9e:
            boolean r6 = r12.m(r4)
            if (r6 == 0) goto Lb7
            int r6 = r12.oq
            r6 = r6 & 4
            if (r6 <= 0) goto Lb7
            if (r14 == 0) goto Lb2
            int r5 = r5.j
            int r6 = r12.vl
            int r5 = r5 - r6
            goto Lb4
        Lb2:
            int r5 = r5.cw
        Lb4:
            r12.j(r13, r5, r0, r2)
        Lb7:
            int r4 = r4 + 1
            goto L1a
        Lbb:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            android.util.SparseIntArray r0 = r2.ws
            if (r0 != 0) goto Lf
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            int r1 = r2.getChildCount()
            r0.<init>(r1)
            r2.ws = r0
        Lf:
            com.bytedance.adsdk.ugeno.flexbox.r r0 = r2.az
            android.util.SparseIntArray r1 = r2.ws
            int[] r0 = r0.j(r3, r4, r5, r1)
            r2.jy = r0
            super.addView(r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j
            return r1
    }

    public android.view.View cw(int r3) {
            r2 = this;
            if (r3 < 0) goto Lf
            int[] r0 = r2.jy
            int r1 = r0.length
            if (r3 < r1) goto L8
            goto Lf
        L8:
            r3 = r0[r3]
            android.view.View r3 = r2.getChildAt(r3)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j
            if (r0 == 0) goto Lc
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r2 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j
            r0.<init>(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getAlignContent() {
            r1 = this;
            int r0 = r1.up
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getAlignItems() {
            r1 = this;
            int r0 = r1.f1939r
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawableHorizontal() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.ae
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawableVertical() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tl
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getFlexDirection() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getFlexItemCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> getFlexLines() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1 = r4.av
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1 = r4.av
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = (com.bytedance.adsdk.ugeno.flexbox.cw) r2
            int r3 = r2.xt()
            if (r3 == 0) goto L11
            r0.add(r2)
            goto L11
        L27:
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> getFlexLinesInternal() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r1.av
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getFlexWrap() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public int getJustifyContent() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getLargestMainSize() {
            r3 = this;
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r3.av
            java.util.Iterator r0 = r0.iterator()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = (com.bytedance.adsdk.ugeno.flexbox.cw) r2
            int r2 = r2.up
            int r1 = java.lang.Math.max(r1, r2)
            goto L8
        L1b:
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getMaxLine() {
            r1 = this;
            int r0 = r1.f1938m
            return r0
    }

    public int getShowDividerHorizontal() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getShowDividerVertical() {
            r1 = this;
            int r0 = r1.oq
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int getSumOfCrossSize() {
            r5 = this;
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r0 = r5.av
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L3e
            java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r3 = r5.av
            java.lang.Object r3 = r3.get(r1)
            com.bytedance.adsdk.ugeno.flexbox.cw r3 = (com.bytedance.adsdk.ugeno.flexbox.cw) r3
            boolean r4 = r5.r(r1)
            if (r4 == 0) goto L25
            boolean r4 = r5.j()
            if (r4 == 0) goto L22
            int r4 = r5.qv
        L20:
            int r2 = r2 + r4
            goto L25
        L22:
            int r4 = r5.vl
            goto L20
        L25:
            boolean r4 = r5.m(r1)
            if (r4 == 0) goto L38
            boolean r4 = r5.j()
            if (r4 == 0) goto L35
            int r4 = r5.qv
        L33:
            int r2 = r2 + r4
            goto L38
        L35:
            int r4 = r5.vl
            goto L33
        L38:
            int r3 = r3.ae
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L3e:
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int j(int r1, int r2, int r3) {
            r0 = this;
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r1, r2, r3)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int j(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int j(android.view.View r2, int r3, int r4) {
            r1 = this;
            boolean r2 = r1.j()
            r0 = 0
            if (r2 == 0) goto L19
            boolean r2 = r1.r(r3, r4)
            if (r2 == 0) goto Lf
            int r0 = r1.vl
        Lf:
            int r2 = r1.oq
            r2 = r2 & 4
            if (r2 <= 0) goto L18
            int r2 = r1.vl
        L17:
            int r0 = r0 + r2
        L18:
            return r0
        L19:
            boolean r2 = r1.r(r3, r4)
            if (r2 == 0) goto L21
            int r0 = r1.qv
        L21:
            int r2 = r1.g
            r2 = r2 & 4
            if (r2 <= 0) goto L2a
            int r2 = r1.qv
            goto L17
        L2a:
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public android.view.View j(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public void j(android.view.View r1, int r2, int r3, com.bytedance.adsdk.ugeno.flexbox.cw r4) {
            r0 = this;
            boolean r1 = r0.r(r2, r3)
            if (r1 == 0) goto L25
            boolean r1 = r0.j()
            if (r1 == 0) goto L19
            int r1 = r4.up
            int r2 = r0.vl
            int r1 = r1 + r2
            r4.up = r1
            int r1 = r4.f1943m
            int r1 = r1 + r2
            r4.f1943m = r1
            return
        L19:
            int r1 = r4.up
            int r2 = r0.qv
            int r1 = r1 + r2
            r4.up = r1
            int r1 = r4.f1943m
            int r1 = r1 + r2
            r4.f1943m = r1
        L25:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public void j(com.bytedance.adsdk.ugeno.flexbox.cw r3) {
            r2 = this;
            boolean r0 = r2.j()
            if (r0 == 0) goto L19
            int r0 = r2.oq
            r0 = r0 & 4
            if (r0 <= 0) goto L2b
            int r0 = r3.up
            int r1 = r2.vl
            int r0 = r0 + r1
            r3.up = r0
            int r0 = r3.f1943m
            int r0 = r0 + r1
            r3.f1943m = r0
            return
        L19:
            int r0 = r2.g
            r0 = r0 & 4
            if (r0 <= 0) goto L2b
            int r0 = r3.up
            int r1 = r2.qv
            int r0 = r0 + r1
            r3.up = r0
            int r0 = r3.f1943m
            int r0 = r0 + r1
            r3.f1943m = r0
        L2b:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public boolean j() {
            r2 = this;
            int r0 = r2.j
            r1 = 1
            if (r0 == 0) goto La
            if (r0 != r1) goto L8
            goto La
        L8:
            r0 = 0
            return r0
        La:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.i
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.i
            if (r0 == 0) goto La
            r0.m()
        La:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.tl
            if (r0 != 0) goto L9
            android.graphics.drawable.Drawable r0 = r6.ae
            if (r0 != 0) goto L9
            goto L24
        L9:
            int r0 = r6.g
            if (r0 != 0) goto L12
            int r0 = r6.oq
            if (r0 != 0) goto L12
            goto L24
        L12:
            int r0 = com.bytedance.adsdk.ugeno.m.ae.j(r6)
            int r1 = r6.j
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L40
            if (r1 == r2) goto L32
            r5 = 3
            if (r1 == r5) goto L25
        L24:
            return
        L25:
            if (r0 != r4) goto L28
            r3 = 1
        L28:
            int r0 = r6.xt
            if (r0 != r2) goto L2e
            r3 = r3 ^ 1
        L2e:
            r6.xt(r7, r3, r4)
            return
        L32:
            if (r0 != r4) goto L35
            goto L36
        L35:
            r4 = 0
        L36:
            int r0 = r6.xt
            if (r0 != r2) goto L3c
            r4 = r4 ^ 1
        L3c:
            r6.xt(r7, r4, r3)
            return
        L40:
            if (r0 == r4) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            int r1 = r6.xt
            if (r1 != r2) goto L4a
            r3 = 1
        L4a:
            r6.j(r7, r0, r3)
            return
        L4e:
            if (r0 != r4) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            int r1 = r6.xt
            if (r1 != r2) goto L58
            r3 = 1
        L58:
            r6.j(r7, r0, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            com.bytedance.adsdk.ugeno.cw r1 = r7.i
            if (r1 == 0) goto L7
            r1.r()
        L7:
            int r1 = com.bytedance.adsdk.ugeno.m.ae.j(r7)
            int r2 = r7.j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L66
            if (r2 == r4) goto L57
            r5 = 2
            if (r2 == r5) goto L43
            r6 = 3
            if (r2 != r6) goto L2d
            if (r1 != r4) goto L1c
            r3 = 1
        L1c:
            int r1 = r7.xt
            if (r1 != r5) goto L22
            r3 = r3 ^ 1
        L22:
            r1 = r3
            r2 = 1
            r0 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.j(r1, r2, r3, r4, r5, r6)
            goto L74
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid flex direction is set: "
            r2.<init>(r3)
            int r3 = r7.j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L43:
            if (r1 != r4) goto L46
            r3 = 1
        L46:
            int r1 = r7.xt
            if (r1 != r5) goto L4c
            r3 = r3 ^ 1
        L4c:
            r1 = r3
            r2 = 0
            r0 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.j(r1, r2, r3, r4, r5, r6)
            goto L74
        L57:
            if (r1 == r4) goto L60
            r1 = 1
        L5a:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            goto L62
        L60:
            r1 = 0
            goto L5a
        L62:
            r0.j(r1, r2, r3, r4, r5)
            goto L74
        L66:
            if (r1 != r4) goto L6f
            r1 = 1
        L69:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            goto L71
        L6f:
            r1 = 0
            goto L69
        L71:
            r0.j(r1, r2, r3, r4, r5)
        L74:
            com.bytedance.adsdk.ugeno.cw r1 = r7.i
            if (r1 == 0) goto L7b
            r1.j(r9, r10, r11, r12)
        L7b:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.i
            if (r0 == 0) goto L12
            int[] r2 = r0.j(r2, r3)
            r3 = 0
            r3 = r2[r3]
            r0 = 1
            r2 = r2[r0]
            r1.j(r3, r2)
            goto L15
        L12:
            r1.j(r2, r3)
        L15:
            com.bytedance.adsdk.ugeno.cw r2 = r1.i
            if (r2 == 0) goto L1c
            r2.cw()
        L1c:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.i
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
        La:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.i
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    public void setAlignContent(int r2) {
            r1 = this;
            int r0 = r1.up
            if (r0 == r2) goto L9
            r1.up = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setAlignItems(int r2) {
            r1 = this;
            int r0 = r1.f1939r
            if (r0 == r2) goto L9
            r1.f1939r = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setDividerDrawableHorizontal(r1)
            r0.setDividerDrawableVertical(r1)
            return
    }

    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.ae
            if (r2 != r0) goto L5
            return
        L5:
            r1.ae = r2
            if (r2 == 0) goto L10
            int r2 = r2.getIntrinsicHeight()
            r1.qv = r2
            goto L13
        L10:
            r2 = 0
            r1.qv = r2
        L13:
            r1.xt()
            r1.requestLayout()
            return
    }

    public void setDividerDrawableVertical(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tl
            if (r2 != r0) goto L5
            return
        L5:
            r1.tl = r2
            if (r2 == 0) goto L10
            int r2 = r2.getIntrinsicWidth()
            r1.vl = r2
            goto L13
        L10:
            r2 = 0
            r1.vl = r2
        L13:
            r1.xt()
            r1.requestLayout()
            return
    }

    public void setFlexDirection(int r2) {
            r1 = this;
            int r0 = r1.j
            if (r0 == r2) goto L9
            r1.j = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public void setFlexLines(java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1) {
            r0 = this;
            r0.av = r1
            return
    }

    public void setFlexWrap(int r2) {
            r1 = this;
            int r0 = r1.xt
            if (r0 == r2) goto L9
            r1.xt = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setJustifyContent(int r2) {
            r1 = this;
            int r0 = r1.cw
            if (r0 == r2) goto L9
            r1.cw = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setMaxLine(int r2) {
            r1 = this;
            int r0 = r1.f1938m
            if (r0 == r2) goto L9
            r1.f1938m = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDivider(int r1) {
            r0 = this;
            r0.setShowDividerVertical(r1)
            r0.setShowDividerHorizontal(r1)
            return
    }

    public void setShowDividerHorizontal(int r2) {
            r1 = this;
            int r0 = r1.g
            if (r2 == r0) goto L9
            r1.g = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividerVertical(int r2) {
            r1 = this;
            int r0 = r1.oq
            if (r2 == r0) goto L9
            r1.oq = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public int xt(int r1, int r2, int r3) {
            r0 = this;
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r1, r2, r3)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.flexbox.j
    public android.view.View xt(int r1) {
            r0 = this;
            android.view.View r1 = r0.cw(r1)
            return r1
    }
}
