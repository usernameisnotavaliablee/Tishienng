package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class y {
    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.lang.Integer> a(int r3, int r4) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        La:
            int r2 = r1.size()
            if (r2 >= r4) goto L1e
            int r2 = r0.nextInt(r3)
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            goto La
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "随机输入的十个数："
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.sort(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "排好序之后的列表："
            r4.append(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.orhanobut.logger.j.c(r4)
            return r3
    }
}
