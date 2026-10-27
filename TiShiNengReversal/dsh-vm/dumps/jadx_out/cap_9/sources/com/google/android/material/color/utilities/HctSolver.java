package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HctSolver {
    static final double[] CRITICAL_PLANES = null;
    static final double[][] LINRGB_FROM_SCALED_DISCOUNT = null;
    static final double[][] SCALED_DISCOUNT_FROM_LINRGB = null;
    static final double[] Y_FROM_LINRGB = null;

    static {
            r0 = 3
            double[] r1 = new double[r0]
            r1 = {x0048: FILL_ARRAY_DATA , data: [4563180690278563712, 4567656682865241161, 4553792858995338393} // fill-array
            double[] r2 = new double[r0]
            r2 = {x0058: FILL_ARRAY_DATA , data: [4558572791660270439, 4569014491814800473, 4554668937701320922} // fill-array
            double[] r3 = new double[r0]
            r3 = {x0068: FILL_ARRAY_DATA , data: [4547115361972976925, 4558086837743593197, 4569750954828417064} // fill-array
            double[][] r4 = new double[r0][]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r2 = 2
            r4[r2] = r3
            com.google.android.material.color.utilities.HctSolver.SCALED_DISCOUNT_FROM_LINRGB = r4
            double[] r3 = new double[r0]
            r3 = {x0078: FILL_ARRAY_DATA , data: [4653754300308803648, -4570817500552742808, -4603490952067231679} // fill-array
            double[] r4 = new double[r0]
            r4 = {x0088: FILL_ARRAY_DATA , data: [-4579882583565303232, 4648134020057450064, -4593606813847174742} // fill-array
            double[] r6 = new double[r0]
            r6 = {x0098: FILL_ARRAY_DATA , data: [4611516187505145207, -4590128720487386175, 4644138734269452162} // fill-array
            double[][] r7 = new double[r0][]
            r7[r5] = r3
            r7[r1] = r4
            r7[r2] = r6
            com.google.android.material.color.utilities.HctSolver.LINRGB_FROM_SCALED_DISCOUNT = r7
            double[] r0 = new double[r0]
            r0 = {x00a8: FILL_ARRAY_DATA , data: [4596827742536767164, 4604617168452267173, 4589866978952703325} // fill-array
            com.google.android.material.color.utilities.HctSolver.Y_FROM_LINRGB = r0
            r0 = 255(0xff, float:3.57E-43)
            double[] r0 = new double[r0]
            r0 = {x00b8: FILL_ARRAY_DATA , data: [4579902191445101026, 4586722248283830121, 4590132276703194669, 4592319419119206566, 4594089090726562190, 4595182661934568139, 4596276233142574086, 4597369804350580035, 4598319297551931200, 4598866083155934174, 4599415152223961264, 4599993339557554103, 4600604127797384872, 4601248022022383854, 4601925516007072940, 4602637092872232998, 4603031022424726288, 4603421598565390387, 4603829911699615164, 4604256184796179975, 4604700636746540938, 4605163482557825057, 4605644933531403035, 4606145197428491360, 4606664478624053163, 4607192698525064880, 4607471656564740588, 4607760420350332768, 4608059085967490067, 4608367748123105663, 4608686500196850546, 4609015434289647817, 4609354641269333833, 4609704210813727368, 4610064231451306159, 4610434790599671070, 4610815974601961079, 4611207868761367246, 4611610557373880335, 4611855071093391427, 4612067334359334994, 4612285118425960339, 4612508463574977203, 4612737409655089301, 4612971996094189114, 4613212261911004224, 4613458245726228713, 4613709985773170670, 4613967519907944419, 4614230885619234013, 4614500120037652566, 4614775259944720202, 4615056341781481853, 4615343401656784577, 4615636475355232722, 4615935598344838114, 4616215211919569774, 4616370875292628065, 4616529615599632208, 4616691449976872178, 4616856395419441158, 4617024468784296090, 4617195686793211866, 4617370066035634218, 4617547622971436010, 4617728373933581454, 4617912335130702427, 4618099522649590851, 4618289952457610916, 4618483640405034599, 4618680602227303887, 4618880853547222806, 4619084409877082270, 4619291286620720537, 4619501499075521954, 4619715062434356516, 4619931991787462676, 4620152302124275621, 4620376008335203209, 4620603125213351606, 4620763442569165759, 4620880433674686702, 4620999152019843489, 4621119604814744327, 4621241799224816048, 4621365742371534952, 4621491441333138438, 4621618903145318084, 4621748134801894866, 4621879143255477120, 4622011935418101880, 4622146518161860145, 4622282898319506637, 4622421082685054575, 4622561078014355982, 4622702891025667973, 4622846528400205557, 4622991996782681293, 4623139302781832335, 4623288452970935186, 4623439453888308616, 4623592312037805078, 4623747033889290991, 4623903625879116247, 4624062094410573275, 4624222445854345961, 4624384686548948761, 4624548822801156258, 4624714860886423508, 4624882807049297389, 4625052667503819266, 4625210632871709275, 4625297486651650571, 4625385306808911890, 4625474096391433360, 4625563858432847940, 4625654595952659106, 4625746311956415008, 4625839009435879146, 4625932691369197680, 4626027360721063483, 4626123020442876984, 4626219673472903927, 4626317322736430091, 4626415971145913094, 4626515621601131305, 4626616276989329999, 4626717940185364762, 4626820614051842266, 4626924301439258476, 4627029005186134299, 4627134728119148831, 4627241473053270172, 4627349242791883926, 4627458040126919441, 4627567867838973780, 4627678728697433589, 4627790625460594799, 4627903560875780285, 4628017537679455519, 4628132558597342234, 4628248626344530177, 4628365743625587008, 4628483913134666308, 4628603137555613863, 4628723419562072149, 4628844761817583119, 4628967166975689348, 4629090637680033469, 4629215176564456113, 4629340786253092199, 4629467469360465727, 4629595228491583094, 4629712241589447398, 4629777201067453150, 4629842702436743186, 4629908746981237562, 4629975335980320128, 4630042470708880985, 4630110152437358354, 4630178382431779783, 4630247161953802740, 4630316492260754622, 4630386374605672153, 4630456810237340203, 4630527800400330062, 4630599346335037121, 4630671449277718047, 4630744110460527385, 4630817331111553677, 4630891112454855033, 4630965455710494212, 4631040362094573213, 4631115832819267388, 4631191869092859051, 4631268472119770665, 4631345643100597525, 4631423383232140038, 4631501693707435534, 4631580575715789650, 4631660030442807299, 4631740059070423220, 4631820662776932122, 4631901842737018425, 4631983600121785599, 4632065936098785144, 4632148851832045157, 4632232348482098562, 4632316427206010939, 4632401089157408025, 4632486335486502848, 4632572167340122509, 4632658585861734647, 4632745592191473537, 4632833187466165889, 4632921372819356314, 4633010149381332451, 4633099518279149837, 4633189480636656412, 4633280037574516751, 4633371190210236008, 4633462939658183536, 4633555287029616272, 4633648233432701789, 4633741779972541089, 4633835927751191153, 4633930677867687184, 4634026031418064590, 4634121989495380747, 4634211284876988415, 4634259870076268772, 4634308759169777192, 4634357952698192419, 4634407451200756650, 4634457255215285655, 4634507365278178801, 4634557781924428958, 4634608505687632279, 4634659537099997902, 4634710876692357502, 4634762524994174769, 4634814482533554771, 4634866749837253199, 4634919327430685537, 4634972215837936106, 4635025415581767022, 4635078927183627061, 4635132751163660409, 4635186888040715339, 4635241338332352781, 4635296102554854808, 4635351181223233026, 4635406574851236876, 4635462283951361850, 4635518309034857618, 4635574650611736079, 4635631309190779308, 4635688285279547439, 4635745579384386464, 4635803192010435943, 4635861123661636633, 4635919374840738054, 4635977946049305967, 4636036837787729777, 4636096050555229854, 4636155584849864797, 4636215441168538620, 4636275620007007844, 4636336121859888558, 4636396947220663375, 4636458096581688329, 4636519570434199722, 4636581369268320872, 4636643493573068830, 4636705943836361001} // fill-array
            com.google.android.material.color.utilities.HctSolver.CRITICAL_PLANES = r0
            return
    }

    private HctSolver() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean areInCyclicOrder(double r0, double r2, double r4) {
            double r2 = r2 - r0
            double r2 = sanitizeRadians(r2)
            double r4 = r4 - r0
            double r0 = sanitizeRadians(r4)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    static double[] bisectToLimit(double r19, double r21) {
            double[][] r0 = bisectToSegment(r19, r21)
            r1 = 0
            r2 = r0[r1]
            double r3 = hueOf(r2)
            r5 = 1
            r0 = r0[r5]
            r6 = 0
        Lf:
            r7 = 3
            if (r6 >= r7) goto L83
            r7 = r2[r6]
            r9 = r0[r6]
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L80
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L31
            double r7 = trueDelinearized(r7)
            int r7 = criticalPlaneBelow(r7)
            r8 = r0[r6]
            double r8 = trueDelinearized(r8)
            int r8 = criticalPlaneAbove(r8)
            goto L43
        L31:
            double r7 = trueDelinearized(r7)
            int r7 = criticalPlaneAbove(r7)
            r8 = r0[r6]
            double r8 = trueDelinearized(r8)
            int r8 = criticalPlaneBelow(r8)
        L43:
            r13 = 0
            r17 = r3
            r3 = r7
            r4 = r8
            r7 = r17
        L4a:
            r9 = 8
            if (r13 >= r9) goto L7f
            int r9 = r4 - r3
            int r9 = java.lang.Math.abs(r9)
            if (r9 > r5) goto L57
            goto L7f
        L57:
            int r9 = r3 + r4
            double r9 = (double) r9
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = r9 / r11
            double r9 = java.lang.Math.floor(r9)
            int r14 = (int) r9
            double[] r9 = com.google.android.material.color.utilities.HctSolver.CRITICAL_PLANES
            r10 = r9[r14]
            double[] r15 = setCoordinate(r2, r10, r0, r6)
            double r11 = hueOf(r15)
            r9 = r21
            boolean r16 = areInCyclicOrder(r7, r9, r11)
            if (r16 == 0) goto L79
            r4 = r14
            r0 = r15
            goto L7c
        L79:
            r7 = r11
            r3 = r14
            r2 = r15
        L7c:
            int r13 = r13 + 1
            goto L4a
        L7f:
            r3 = r7
        L80:
            int r6 = r6 + 1
            goto Lf
        L83:
            double[] r0 = midpoint(r2, r0)
            return r0
    }

    static double[][] bisectToSegment(double r20, double r22) {
            r0 = 3
            double[] r0 = new double[r0]
            r1 = 0
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0[r1] = r2
            r4 = 1
            r0[r4] = r2
            r5 = 2
            r0[r5] = r2
            r2 = 0
            r6 = r0
            r10 = r2
            r14 = r10
            r7 = 0
            r8 = 0
            r9 = 1
        L16:
            r12 = 12
            if (r7 >= r12) goto L5f
            r12 = r20
            double[] r16 = nthVertex(r12, r7)
            r17 = r16[r1]
            int r19 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r19 >= 0) goto L29
            r18 = r14
            goto L44
        L29:
            double r12 = hueOf(r16)
            if (r8 != 0) goto L36
            r10 = r12
            r14 = r10
            r0 = r16
            r6 = r0
            r8 = 1
            goto L5c
        L36:
            if (r9 != 0) goto L47
            boolean r17 = areInCyclicOrder(r10, r12, r14)
            r18 = r14
            if (r17 == 0) goto L44
        L40:
            r14 = r12
            r12 = r22
            goto L4a
        L44:
            r14 = r18
            goto L5c
        L47:
            r18 = r14
            goto L40
        L4a:
            boolean r9 = areInCyclicOrder(r10, r12, r14)
            r12 = r14
            if (r9 == 0) goto L56
            r14 = r12
            r6 = r16
        L54:
            r9 = 0
            goto L5c
        L56:
            r10 = r12
            r0 = r16
            r14 = r18
            goto L54
        L5c:
            int r7 = r7 + 1
            goto L16
        L5f:
            double[][] r2 = new double[r5][]
            r2[r1] = r0
            r2[r4] = r6
            return r2
    }

    static double chromaticAdaptation(double r4) {
            double r0 = java.lang.Math.abs(r4)
            r2 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r0 = java.lang.Math.pow(r0, r2)
            int r4 = com.google.android.material.color.utilities.MathUtils.signum(r4)
            double r4 = (double) r4
            r2 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r4 = r4 * r2
            double r4 = r4 * r0
            r2 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r0 = r0 + r2
            double r4 = r4 / r0
            return r4
    }

    static int criticalPlaneAbove(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 - r0
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            return r2
    }

    static int criticalPlaneBelow(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 - r0
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            return r2
    }

    static int findResultByJ(double r35, double r37, double r39) {
            double r0 = java.lang.Math.sqrt(r39)
            r2 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r0 = r0 * r2
            com.google.android.material.color.utilities.ViewingConditions r4 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            r5 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r7 = r4.getN()
            double r5 = java.lang.Math.pow(r5, r7)
            r7 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r7 = r7 - r5
            r5 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r5 = java.lang.Math.pow(r7, r5)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r7 / r5
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r35 + r9
            double r11 = java.lang.Math.cos(r11)
            r13 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r11 = r11 + r13
            r13 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r11 = r11 * r13
            r13 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r11 = r11 * r13
            double r13 = r4.getNc()
            double r11 = r11 * r13
            double r13 = r4.getNcb()
            double r11 = r11 * r13
            double r13 = java.lang.Math.sin(r35)
            double r15 = java.lang.Math.cos(r35)
            r17 = 0
            r18 = r2
            r2 = 0
        L5c:
            r3 = 5
            if (r2 >= r3) goto L191
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            r22 = r7
            double r7 = r0 / r20
            r20 = 0
            int r3 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r3 == 0) goto L79
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 != 0) goto L70
            goto L79
        L70:
            double r24 = java.lang.Math.sqrt(r7)
            double r24 = r37 / r24
        L76:
            r26 = r9
            goto L7c
        L79:
            r24 = r20
            goto L76
        L7c:
            double r9 = r24 * r5
            r35 = r0
            r0 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r0 = java.lang.Math.pow(r9, r0)
            double r9 = r4.getAw()
            double r24 = r4.getC()
            double r24 = r22 / r24
            double r28 = r4.getZ()
            r30 = r0
            double r0 = r24 / r28
            double r0 = java.lang.Math.pow(r7, r0)
            double r9 = r9 * r0
            double r0 = r4.getNbb()
            double r9 = r9 / r0
            r0 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r0 = r0 + r9
            r7 = 4627167142146473984(0x4037000000000000, double:23.0)
            double r0 = r0 * r7
            double r0 = r0 * r30
            double r7 = r7 * r11
            double r24 = r30 * r18
            double r24 = r24 * r15
            double r7 = r7 + r24
            r24 = 4637300241308057600(0x405b000000000000, double:108.0)
            double r24 = r24 * r30
            double r24 = r24 * r13
            double r7 = r7 + r24
            double r0 = r0 / r7
            double r7 = r0 * r15
            double r0 = r0 * r13
            r24 = 4646800021772042240(0x407cc00000000000, double:460.0)
            double r9 = r9 * r24
            r24 = 4646641692097642496(0x407c300000000000, double:451.0)
            double r24 = r24 * r7
            double r24 = r9 + r24
            r28 = 4643774165772402688(0x4072000000000000, double:288.0)
            double r28 = r28 * r0
            double r24 = r24 + r28
            r28 = 4653885274701430784(0x4095ec0000000000, double:1403.0)
            double r24 = r24 / r28
            r30 = 4651048534701768704(0x408bd80000000000, double:891.0)
            double r30 = r30 * r7
            double r30 = r9 - r30
            r32 = 4643299176749203456(0x4070500000000000, double:261.0)
            double r32 = r32 * r0
            double r30 = r30 - r32
            double r30 = r30 / r28
            r32 = 4641944578423783424(0x406b800000000000, double:220.0)
            double r7 = r7 * r32
            double r9 = r9 - r7
            r7 = 4663648937956081664(0x40b89c0000000000, double:6300.0)
            double r0 = r0 * r7
            double r9 = r9 - r0
            double r9 = r9 / r28
            double r0 = inverseChromaticAdaptation(r24)
            double r7 = inverseChromaticAdaptation(r30)
            double r9 = inverseChromaticAdaptation(r9)
            r3 = 3
            double[] r3 = new double[r3]
            r3[r17] = r0
            r0 = 1
            r3[r0] = r7
            r1 = 2
            r3[r1] = r9
            double[][] r7 = com.google.android.material.color.utilities.HctSolver.LINRGB_FROM_SCALED_DISCOUNT
            double[] r3 = com.google.android.material.color.utilities.MathUtils.matrixMultiply(r3, r7)
            r7 = r3[r17]
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 < 0) goto L191
            r9 = r3[r0]
            int r24 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r24 < 0) goto L191
            r24 = r3[r1]
            int r28 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r28 >= 0) goto L13a
            goto L191
        L13a:
            double[] r28 = com.google.android.material.color.utilities.HctSolver.Y_FROM_LINRGB
            r29 = r28[r17]
            r31 = r28[r0]
            r33 = r28[r1]
            double r29 = r29 * r7
            double r31 = r31 * r9
            double r29 = r29 + r31
            double r33 = r33 * r24
            double r29 = r29 + r33
            int r7 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r7 > 0) goto L151
            return r17
        L151:
            r7 = 4
            if (r2 == r7) goto L174
            double r7 = r29 - r39
            double r9 = java.lang.Math.abs(r7)
            r20 = 4566758108544739836(0x3f60624dd2f1a9fc, double:0.002)
            int r24 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r24 >= 0) goto L164
            goto L174
        L164:
            double r7 = r7 * r35
            double r29 = r29 * r26
            double r7 = r7 / r29
            double r0 = r35 - r7
            int r2 = r2 + 1
            r7 = r22
            r9 = r26
            goto L5c
        L174:
            r4 = r3[r17]
            r6 = 4636737995042078065(0x405900a3d70a3d71, double:100.01)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L191
            r4 = r3[r0]
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L191
            r0 = r3[r1]
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L18c
            goto L191
        L18c:
            int r0 = com.google.android.material.color.utilities.ColorUtils.argbFromLinrgb(r3)
            return r0
        L191:
            return r17
    }

    static double hueOf(double[] r12) {
            double[][] r0 = com.google.android.material.color.utilities.HctSolver.SCALED_DISCOUNT_FROM_LINRGB
            double[] r12 = com.google.android.material.color.utilities.MathUtils.matrixMultiply(r12, r0)
            r0 = 0
            r0 = r12[r0]
            double r0 = chromaticAdaptation(r0)
            r2 = 1
            r2 = r12[r2]
            double r2 = chromaticAdaptation(r2)
            r4 = 2
            r4 = r12[r4]
            double r4 = chromaticAdaptation(r4)
            r6 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r8 = r0 * r6
            r10 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r10 = r10 * r2
            double r8 = r8 + r10
            double r8 = r8 + r4
            double r8 = r8 / r6
            double r0 = r0 + r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r2
            double r0 = r0 - r4
            r2 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.atan2(r0, r8)
            return r0
    }

    static double intercept(double r0, double r2, double r4) {
            double r2 = r2 - r0
            double r4 = r4 - r0
            double r2 = r2 / r4
            return r2
    }

    static double inverseChromaticAdaptation(double r6) {
            double r0 = java.lang.Math.abs(r6)
            r2 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r2 = r2 * r0
            r4 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r4 = r4 - r0
            double r2 = r2 / r4
            r0 = 0
            double r0 = java.lang.Math.max(r0, r2)
            int r6 = com.google.android.material.color.utilities.MathUtils.signum(r6)
            double r6 = (double) r6
            r2 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r0 = java.lang.Math.pow(r0, r2)
            double r6 = r6 * r0
            return r6
    }

    static boolean isBounded(double r3) {
            r0 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto Le
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r3 = 1
            return r3
        Le:
            r3 = 0
            return r3
    }

    static double[] lerpPoint(double[] r11, double r12, double[] r14) {
            r0 = 0
            r1 = r11[r0]
            r3 = r14[r0]
            double r3 = r3 - r1
            double r3 = r3 * r12
            double r1 = r1 + r3
            r3 = 1
            r4 = r11[r3]
            r6 = r14[r3]
            double r6 = r6 - r4
            double r6 = r6 * r12
            double r4 = r4 + r6
            r6 = 2
            r7 = r11[r6]
            r9 = r14[r6]
            double r9 = r9 - r7
            double r9 = r9 * r12
            double r7 = r7 + r9
            r11 = 3
            double[] r11 = new double[r11]
            r11[r0] = r1
            r11[r3] = r4
            r11[r6] = r7
            return r11
    }

    static double[] midpoint(double[] r11, double[] r12) {
            r0 = 0
            r1 = r11[r0]
            r3 = r12[r0]
            double r1 = r1 + r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            r5 = 1
            r6 = r11[r5]
            r8 = r12[r5]
            double r6 = r6 + r8
            double r6 = r6 / r3
            r8 = 2
            r9 = r11[r8]
            r11 = r12[r8]
            double r9 = r9 + r11
            double r9 = r9 / r3
            r11 = 3
            double[] r11 = new double[r11]
            r11[r0] = r1
            r11[r5] = r6
            r11[r8] = r9
            return r11
    }

    static double[] nthVertex(double r17, int r19) {
            r0 = r19
            double[] r1 = com.google.android.material.color.utilities.HctSolver.Y_FROM_LINRGB
            r2 = 0
            r3 = r1[r2]
            r5 = 1
            r6 = r1[r5]
            r8 = 2
            r9 = r1[r8]
            int r1 = r0 % 4
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            r13 = 0
            if (r1 > r5) goto L17
            r15 = r13
            goto L18
        L17:
            r15 = r11
        L18:
            int r1 = r0 % 2
            if (r1 != 0) goto L1d
            r11 = r13
        L1d:
            r1 = 3
            r13 = 4
            if (r0 >= r13) goto L3e
            double r6 = r6 * r15
            double r6 = r17 - r6
            double r9 = r9 * r11
            double r6 = r6 - r9
            double r6 = r6 / r3
            boolean r0 = isBounded(r6)
            if (r0 == 0) goto L38
            double[] r0 = new double[r1]
            r0[r2] = r6
            r0[r5] = r15
            r0[r8] = r11
            return r0
        L38:
            double[] r0 = new double[r1]
            r0 = {x007c: FILL_ARRAY_DATA , data: [-4616189618054758400, -4616189618054758400, -4616189618054758400} // fill-array
            return r0
        L3e:
            r13 = 8
            if (r0 >= r13) goto L5f
            double r3 = r3 * r11
            double r3 = r17 - r3
            double r9 = r9 * r15
            double r3 = r3 - r9
            double r3 = r3 / r6
            boolean r0 = isBounded(r3)
            if (r0 == 0) goto L59
            double[] r0 = new double[r1]
            r0[r2] = r11
            r0[r5] = r3
            r0[r8] = r15
            return r0
        L59:
            double[] r0 = new double[r1]
            r0 = {x008c: FILL_ARRAY_DATA , data: [-4616189618054758400, -4616189618054758400, -4616189618054758400} // fill-array
            return r0
        L5f:
            double r3 = r3 * r15
            double r3 = r17 - r3
            double r6 = r6 * r11
            double r3 = r3 - r6
            double r3 = r3 / r9
            boolean r0 = isBounded(r3)
            if (r0 == 0) goto L76
            double[] r0 = new double[r1]
            r0[r2] = r15
            r0[r5] = r11
            r0[r8] = r3
            return r0
        L76:
            double[] r0 = new double[r1]
            r0 = {x009c: FILL_ARRAY_DATA , data: [-4616189618054758400, -4616189618054758400, -4616189618054758400} // fill-array
            return r0
    }

    static double sanitizeRadians(double r2) {
            r0 = 4627767455434157336(0x403921fb54442d18, double:25.132741228718345)
            double r2 = r2 + r0
            r0 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 % r0
            return r2
    }

    static double[] setCoordinate(double[] r6, double r7, double[] r9, int r10) {
            r0 = r6[r10]
            r4 = r9[r10]
            r2 = r7
            double r7 = intercept(r0, r2, r4)
            double[] r6 = lerpPoint(r6, r7, r9)
            return r6
    }

    public static com.google.android.material.color.utilities.Cam16 solveToCam(double r0, double r2, double r4) {
            int r0 = solveToInt(r0, r2, r4)
            com.google.android.material.color.utilities.Cam16 r0 = com.google.android.material.color.utilities.Cam16.fromInt(r0)
            return r0
    }

    public static int solveToInt(double r8, double r10, double r12) {
            r0 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L3d
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L3d
            r0 = 4636737284317761870(0x4058fffe5c91d14e, double:99.9999)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto L3d
        L17:
            double r8 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r8)
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 / r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r8 * r0
            double r6 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r12)
            r4 = r10
            int r8 = findResultByJ(r2, r4, r6)
            if (r8 == 0) goto L34
            return r8
        L34:
            double[] r8 = bisectToLimit(r6, r2)
            int r8 = com.google.android.material.color.utilities.ColorUtils.argbFromLinrgb(r8)
            return r8
        L3d:
            int r8 = com.google.android.material.color.utilities.ColorUtils.argbFromLstar(r12)
            return r8
    }

    static double trueDelinearized(double r3) {
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r0
            r0 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            r0 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            double r3 = r3 * r0
            goto L2a
        L14:
            r0 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            double r3 = java.lang.Math.pow(r3, r0)
            r0 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            double r3 = r3 * r0
            r0 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            double r3 = r3 - r0
        L2a:
            r0 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r3 = r3 * r0
            return r3
    }
}
