package m0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final m0.a.C0247a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nVoiceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceUtils.kt\ncom/bxkj/student/v2/common/utils/voice/VoiceUtils$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,225:1\n37#2,2:226\n37#2,2:228\n*S KotlinDebug\n*F\n+ 1 VoiceUtils.kt\ncom/bxkj/student/v2/common/utils/voice/VoiceUtils$Companion\n*L\n81#1:226,2\n200#1:228,2\n*E\n"})
    /* renamed from: m0.a$a, reason: collision with other inner class name */
    public static final class C0247a {
        private C0247a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0247a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void a(@org.jetbrains.annotations.NotNull android.content.Context r19, long r20, double r22, int r24) {
                r18 = this;
                r0 = r19
                r1 = r24
                r2 = 2131886173(0x7f12005d, float:1.9406917E38)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 2131886109(0x7f12001d, float:1.9406788E38)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                java.lang.String r5 = "mContext"
                kotlin.jvm.internal.g0.p(r0, r5)
                com.bxkj.base.v2.data.b$a r5 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r5 = r5.a()
                int r5 = r5.o()
                r6 = 3
                if (r5 != r6) goto L26
                goto L385
            L26:
                r6 = 0
                int r8 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
                if (r8 != 0) goto L2e
                goto L385
            L2e:
                r8 = 216000000(0xcdfe600, double:1.067181795E-315)
                r10 = 0
                int r11 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
                if (r11 <= 0) goto L3e
                java.lang.String r0 = "超过60个小时，无法语音播报"
                java.lang.Object[] r1 = new java.lang.Object[r10]
                com.orhanobut.logger.j.d(r0, r1)
                return
            L3e:
                r8 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
                int r11 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
                if (r11 <= 0) goto L4f
                java.lang.String r0 = "超过60Km，无法语音播报"
                java.lang.Object[] r1 = new java.lang.Object[r10]
                com.orhanobut.logger.j.d(r0, r1)
                return
            L4f:
                r8 = 60
                r11 = 1
                if (r5 == 0) goto L5f
                if (r5 == r11) goto L5d
                r12 = 2
                if (r5 == r12) goto L5a
                goto L5f
            L5a:
                r8 = 300(0x12c, double:1.48E-321)
                goto L5f
            L5d:
                r8 = 120(0x78, double:5.93E-322)
            L5f:
                long r8 = r20 % r8
                int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r5 != 0) goto L385
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r6 = 2131886087(0x7f120007, float:1.9406743E38)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.add(r6)
                r6 = 2131886080(0x7f120000, float:1.9406729E38)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.add(r6)
                com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
                com.bxkj.student.v2.common.data.i$a r7 = com.bxkj.student.v2.common.data.i.a
                java.util.Map r7 = r7.B()
                java.lang.String r8 = "runType"
                int r6 = r6.k(r7, r8)
                r7 = 5
                java.lang.String r8 = "raw"
                java.lang.String r9 = "num_"
                if (r6 == r7) goto L2f2
                java.lang.String r12 = com.bxkj.student.run.app.utils.i.c(r22)
                kotlin.jvm.internal.g0.m(r12)
                java.lang.String r6 = "."
                java.lang.String[] r13 = new java.lang.String[]{r6}
                r16 = 6
                r17 = 0
                r14 = 0
                r15 = 0
                java.util.List r6 = kotlin.text.u.m5(r12, r13, r14, r15, r16, r17)
                java.util.Collection r6 = (java.util.Collection) r6
                java.lang.String[] r7 = new java.lang.String[r10]
                java.lang.Object[] r6 = r6.toArray(r7)
                java.lang.String[] r6 = (java.lang.String[]) r6
                r7 = r6[r10]
                int r7 = java.lang.Integer.parseInt(r7)
                android.content.res.Resources r12 = r0.getResources()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r9)
                r13.append(r7)
                java.lang.String r7 = r13.toString()
                android.content.pm.ApplicationInfo r13 = r0.getApplicationInfo()
                java.lang.String r13 = r13.packageName
                int r7 = r12.getIdentifier(r7, r8, r13)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5.add(r7)
                r6 = r6[r11]
                java.lang.String r7 = "0"
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r6)
                if (r7 != 0) goto L12b
                r7 = 2131886088(0x7f120008, float:1.9406745E38)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5.add(r7)
                char[] r6 = r6.toCharArray()
                java.lang.String r7 = "toCharArray(...)"
                kotlin.jvm.internal.g0.o(r6, r7)
                int r7 = r6.length
                r12 = 0
            Lfc:
                if (r12 >= r7) goto L12b
                char r13 = r6[r12]
                java.lang.String r13 = java.lang.String.valueOf(r13)
                android.content.res.Resources r14 = r0.getResources()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r9)
                r15.append(r13)
                java.lang.String r13 = r15.toString()
                android.content.pm.ApplicationInfo r15 = r0.getApplicationInfo()
                java.lang.String r15 = r15.packageName
                int r13 = r14.getIdentifier(r13, r8, r15)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r5.add(r13)
                int r12 = r12 + 1
                goto Lfc
            L12b:
                r6 = 2131886100(0x7f120014, float:1.940677E38)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.add(r6)
                r6 = 100000(0x186a0, float:1.4013E-40)
                int r6 = r1 / r6
                int r6 = r6 % 10
                if (r6 <= 0) goto L165
                android.content.res.Resources r7 = r0.getResources()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r9)
                r12.append(r6)
                java.lang.String r12 = r12.toString()
                android.content.pm.ApplicationInfo r13 = r0.getApplicationInfo()
                java.lang.String r13 = r13.packageName
                int r7 = r7.getIdentifier(r12, r8, r13)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5.add(r7)
                r5.add(r2)
            L165:
                int r7 = r1 / 10000
                int r7 = r7 % 10
                if (r7 <= 0) goto L19a
                android.content.res.Resources r12 = r0.getResources()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r9)
                r13.append(r7)
                java.lang.String r13 = r13.toString()
                android.content.pm.ApplicationInfo r14 = r0.getApplicationInfo()
                java.lang.String r14 = r14.packageName
                int r12 = r12.getIdentifier(r13, r8, r14)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r5.add(r12)
                r12 = 2131886182(0x7f120066, float:1.9406936E38)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r5.add(r12)
                goto L19f
            L19a:
                if (r6 <= 0) goto L19f
                r5.add(r4)
            L19f:
                int r12 = r1 / 1000
                int r12 = r12 % 10
                if (r12 <= 0) goto L1d4
                android.content.res.Resources r13 = r0.getResources()
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r14.append(r12)
                java.lang.String r14 = r14.toString()
                android.content.pm.ApplicationInfo r15 = r0.getApplicationInfo()
                java.lang.String r15 = r15.packageName
                int r13 = r13.getIdentifier(r14, r8, r15)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r5.add(r13)
                r13 = 2131886098(0x7f120012, float:1.9406765E38)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r5.add(r13)
                goto L1d9
            L1d4:
                if (r7 <= 0) goto L1d9
                r5.add(r4)
            L1d9:
                int r13 = r1 / 100
                int r13 = r13 % 10
                if (r13 <= 0) goto L210
                android.content.res.Resources r14 = r0.getResources()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r9)
                r15.append(r13)
                java.lang.String r15 = r15.toString()
                r16 = 1
                android.content.pm.ApplicationInfo r11 = r0.getApplicationInfo()
                java.lang.String r11 = r11.packageName
                int r11 = r14.getIdentifier(r15, r8, r11)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r5.add(r11)
                r11 = 2131886081(0x7f120001, float:1.940673E38)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r5.add(r11)
                goto L217
            L210:
                r16 = 1
                if (r12 <= 0) goto L217
                r5.add(r4)
            L217:
                int r11 = r1 / 10
                int r11 = r11 % 10
                if (r11 <= 0) goto L245
                android.content.res.Resources r14 = r0.getResources()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r9)
                r15.append(r11)
                java.lang.String r15 = r15.toString()
                android.content.pm.ApplicationInfo r10 = r0.getApplicationInfo()
                java.lang.String r10 = r10.packageName
                int r10 = r14.getIdentifier(r15, r8, r10)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r5.add(r10)
                r5.add(r2)
                goto L24a
            L245:
                if (r13 <= 0) goto L24a
                r5.add(r4)
            L24a:
                int r2 = r1 % 10
                if (r2 <= 0) goto L272
                android.content.res.Resources r10 = r0.getResources()
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r14.append(r2)
                java.lang.String r14 = r14.toString()
                android.content.pm.ApplicationInfo r15 = r0.getApplicationInfo()
                java.lang.String r15 = r15.packageName
                int r10 = r10.getIdentifier(r14, r8, r15)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r5.add(r10)
            L272:
                if (r1 <= 0) goto L296
                int r10 = r5.size()
                if (r10 <= 0) goto L296
                int r10 = r5.size()
                int r10 = r10 + (-1)
                java.lang.Object r10 = r5.get(r10)
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                if (r10 != r3) goto L296
                int r1 = r5.size()
                int r1 = r1 + (-1)
                r5.remove(r1)
                goto L29b
            L296:
                if (r1 != 0) goto L29b
                r5.add(r4)
            L29b:
                r1 = 2131886175(0x7f12005f, float:1.9406921E38)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.add(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "文字="
                r1.append(r3)
                r1.append(r6)
                java.lang.String r3 = "十"
                r1.append(r3)
                r1.append(r7)
                java.lang.String r4 = "万"
                r1.append(r4)
                r1.append(r12)
                java.lang.String r4 = "千"
                r1.append(r4)
                r1.append(r13)
                java.lang.String r4 = "百"
                r1.append(r4)
                r1.append(r11)
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = "个"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.orhanobut.logger.j.d(r1, r3)
                r1 = 2131886089(0x7f120009, float:1.9406747E38)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.add(r1)
                goto L2f4
            L2f2:
                r16 = 1
            L2f4:
                java.lang.String r10 = com.bxkj.student.run.app.utils.i.g(r20)
                kotlin.jvm.internal.g0.m(r10)
                java.lang.String r1 = ":"
                java.lang.String[] r11 = new java.lang.String[]{r1}
                r14 = 6
                r15 = 0
                r12 = 0
                r13 = 0
                java.util.List r1 = kotlin.text.u.m5(r10, r11, r12, r13, r14, r15)
                java.util.Collection r1 = (java.util.Collection) r1
                r2 = 0
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r3)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = r1[r2]
                int r2 = java.lang.Integer.parseInt(r2)
                if (r2 <= 0) goto L34a
                android.content.res.Resources r3 = r0.getResources()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo()
                java.lang.String r4 = r4.packageName
                int r2 = r3.getIdentifier(r2, r8, r4)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                r2 = 2131886097(0x7f120011, float:1.9406763E38)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
            L34a:
                r1 = r1[r16]
                int r1 = java.lang.Integer.parseInt(r1)
                android.content.res.Resources r2 = r0.getResources()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r9)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
                java.lang.String r3 = r3.packageName
                int r1 = r2.getIdentifier(r1, r8, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.add(r1)
                r1 = 2131886108(0x7f12001c, float:1.9406786E38)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.add(r1)
                com.bxkj.student.run.app.utils.d0 r1 = com.bxkj.student.run.app.utils.d0.e()
                r1.l(r0, r5)
            L385:
                return
        }

        public final void b(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull int... r3) {
                r1 = this;
                java.lang.String r0 = "mContext"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "raw"
                kotlin.jvm.internal.g0.p(r3, r0)
                com.bxkj.student.run.app.utils.d0 r0 = com.bxkj.student.run.app.utils.d0.e()
                java.util.List r3 = kotlin.collections.n.bz(r3)
                r0.l(r2, r3)
                return
        }
    }

    static {
            m0.a$a r0 = new m0.a$a
            r1 = 0
            r0.<init>(r1)
            m0.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }
}
