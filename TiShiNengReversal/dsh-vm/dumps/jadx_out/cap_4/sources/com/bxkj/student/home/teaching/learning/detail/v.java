package com.bxkj.student.home.teaching.learning.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class v {
    private final char[] a;
    private int[] b;
    private android.text.SpannableString c;
    private android.content.Context d;

    public v(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 10
            char[] r0 = new char[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            r1.a = r0
            r1.d = r2
            return
    }

    public android.text.SpannableString a() {
            r12 = this;
            android.content.Context r0 = r12.d
            r1 = 2131099714(0x7f060042, float:1.781179E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099717(0x7f060045, float:1.7811795E38)
            int r3 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099719(0x7f060047, float:1.78118E38)
            int r4 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131100565(0x7f060395, float:1.7813515E38)
            int r5 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099730(0x7f060052, float:1.7811821E38)
            int r6 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131100525(0x7f06036d, float:1.7813434E38)
            int r7 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131100546(0x7f060382, float:1.7813477E38)
            int r8 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099731(0x7f060053, float:1.7811823E38)
            int r9 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            int r10 = androidx.core.content.ContextCompat.getColor(r0, r1)
            android.content.Context r0 = r12.d
            r1 = 2131099718(0x7f060046, float:1.7811797E38)
            int r11 = androidx.core.content.ContextCompat.getColor(r0, r1)
            int[] r0 = new int[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            r12.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L67:
            r3 = 4
            if (r2 >= r3) goto L80
            char[] r3 = r12.a
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            char[] r5 = r12.a
            int r5 = r5.length
            int r4 = r4.nextInt(r5)
            char r3 = r3[r4]
            r0.append(r3)
            int r2 = r2 + 1
            goto L67
        L80:
            java.lang.String r0 = r0.toString()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            r12.c = r2
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int[] r4 = r12.b
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int[] r6 = r12.b
            int r6 = r6.length
            int r5 = r5.nextInt(r6)
            r4 = r4[r5]
            r0.<init>(r4)
            r4 = 1
            r5 = 33
            r2.setSpan(r0, r1, r4, r5)
            android.text.SpannableString r0 = r12.c
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            int[] r2 = r12.b
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int[] r7 = r12.b
            int r7 = r7.length
            int r6 = r6.nextInt(r7)
            r2 = r2[r6]
            r1.<init>(r2)
            r2 = 2
            r0.setSpan(r1, r4, r2, r5)
            android.text.SpannableString r0 = r12.c
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            int[] r4 = r12.b
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int[] r7 = r12.b
            int r7 = r7.length
            int r6 = r6.nextInt(r7)
            r4 = r4[r6]
            r1.<init>(r4)
            r4 = 3
            r0.setSpan(r1, r2, r4, r5)
            android.text.SpannableString r0 = r12.c
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            int[] r2 = r12.b
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int[] r7 = r12.b
            int r7 = r7.length
            int r6 = r6.nextInt(r7)
            r2 = r2[r6]
            r1.<init>(r2)
            r0.setSpan(r1, r4, r3, r5)
            android.text.SpannableString r0 = r12.c
            return r0
    }

    public android.text.SpannableString b() {
            r1 = this;
            android.text.SpannableString r0 = r1.c
            return r0
    }
}
