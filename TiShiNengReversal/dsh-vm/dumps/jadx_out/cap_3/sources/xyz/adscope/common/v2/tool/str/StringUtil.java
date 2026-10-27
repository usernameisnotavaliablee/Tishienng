package xyz.adscope.common.v2.tool.str;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StringUtil {
    public static final java.lang.String EMPTY_LIST_STRING = "[]";
    private static final java.lang.String PATTERN_CRASH_DATE = "yyyy-MM-dd HH:MM:SS";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class StringStyleBean extends android.text.style.ClickableSpan {
        private final java.lang.String color;
        private final java.lang.String str;

        public StringStyleBean(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.str = r1
                r0.color = r2
                return
        }

        static /* synthetic */ java.lang.String access$000(xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean r0) {
                java.lang.String r0 = r0.str
                return r0
        }

        @Override // android.text.style.ClickableSpan
        public abstract void onClick(@androidx.annotation.NonNull android.view.View r1);

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.NonNull android.text.TextPaint r2) {
                r1 = this;
                super.updateDrawState(r2)
                java.lang.String r0 = r1.color
                int r0 = android.graphics.Color.parseColor(r0)
                r2.setColor(r0)
                r0 = 0
                r2.setUnderlineText(r0)
                return
        }
    }

    private StringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String bytesToHexString(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L1d
            r4 = 48
            r0.append(r4)
        L1d:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String escapeJsonAsString(java.lang.String r2) {
            java.lang.String r0 = "\""
            java.lang.String r1 = "\\\""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static java.lang.String formatCrashLogDate(long r1) {
            java.lang.String r0 = "yyyy-MM-dd HH:MM:SS"
            java.lang.String r1 = formatDate(r1, r0)
            return r1
    }

    public static java.lang.String formatDate(long r2, java.lang.String r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.<init>(r4, r1)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r2 = r0.format(r4)
            return r2
    }

    public static java.lang.String getFileNameFromURL(java.lang.String r3) {
            java.lang.String r0 = "/"
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L16
            r1.<init>(r3)     // Catch: java.net.MalformedURLException -> L16
            java.lang.String r1 = r1.getPath()     // Catch: java.net.MalformedURLException -> L16
            int r2 = r1.lastIndexOf(r0)     // Catch: java.net.MalformedURLException -> L16
            int r2 = r2 + 1
            java.lang.String r3 = r1.substring(r2)     // Catch: java.net.MalformedURLException -> L16
            return r3
        L16:
            java.lang.String r1 = "?"
            boolean r2 = r3.contains(r1)
            if (r2 == 0) goto L33
            int r1 = r3.indexOf(r1)
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            int r0 = r3.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
        L33:
            int r0 = r3.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
    }

    public static java.lang.String getFileSuffixFromURL(java.lang.String r2) {
            java.lang.String r2 = getFileNameFromURL(r2)
            java.lang.String r0 = "."
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L16
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
        L16:
            return r2
    }

    public static byte[] hexStringToBytes(java.lang.String r7) {
            int r0 = r7.length()
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            int r3 = r2 / 2
            char r4 = r7.charAt(r2)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r6 = r2 + 1
            char r6 = r7.charAt(r6)
            int r5 = java.lang.Character.digit(r6, r5)
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 2
            goto L9
        L2a:
            return r1
    }

    public static boolean isValidColor(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = "#[a-fA-F\\d]{6}"
            boolean r0 = xyz.adscope.common.v2.tool.str.RegexUtil.match(r2, r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "#[a-fA-F\\d]{8}"
            boolean r2 = xyz.adscope.common.v2.tool.str.RegexUtil.match(r2, r0)
            if (r2 == 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r2 = 1
            return r2
        L1b:
            return r1
    }

    public static boolean isValidURL(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L7
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static java.lang.String jsonMappingListToString(java.util.List<? extends xyz.adscope.common.v2.model.IJsonMappingModel> r1, java.lang.String r2) {
            if (r1 == 0) goto L4b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "["
            r2.append(r0)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r1.next()
            xyz.adscope.common.v2.model.IJsonMappingModel r0 = (xyz.adscope.common.v2.model.IJsonMappingModel) r0
            java.lang.String r0 = r0.toJsonString()
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            goto L16
        L2f:
            int r1 = r2.length()
            r0 = 1
            if (r1 <= r0) goto L41
            int r1 = r2.length()
            int r1 = r1 - r0
            r0 = 93
            r2.setCharAt(r1, r0)
            goto L46
        L41:
            java.lang.String r1 = "]"
            r2.append(r1)
        L46:
            java.lang.String r1 = r2.toString()
            return r1
        L4b:
            return r2
    }

    public static java.util.Set<java.lang.String> jsonMappingListToStringSet(java.util.List<? extends xyz.adscope.common.v2.model.IJsonMappingModel> r2) {
            if (r2 == 0) goto L26
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L26
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            xyz.adscope.common.v2.model.IJsonMappingModel r1 = (xyz.adscope.common.v2.model.IJsonMappingModel) r1
            java.lang.String r1 = r1.toJsonString()
            r0.add(r1)
            goto L11
        L25:
            return r0
        L26:
            r2 = 0
            return r2
    }

    public static boolean modelSizeByPercent(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "%"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static double parseDouble(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static double parseDoubleOrDefault(java.lang.String r1, double r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> Lb
            return r1
        Lb:
            return r2
    }

    public static float parseFloat(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int parseInt(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static long parseLong(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static float parseSizePercent(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L23
            java.lang.String r0 = "%"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L23
            int r0 = r2.indexOf(r0)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r2 = r2.trim()
            float r2 = parseFloat(r2)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            return r2
        L23:
            r2 = 0
            return r2
    }

    public static android.text.SpannableString parseSpannableString(java.lang.String r7, xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean... r8) {
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            if (r8 == 0) goto L26
            int r1 = r8.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L26
            r3 = r8[r2]
            java.lang.String r4 = xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean.access$000(r3)
            int r4 = r7.indexOf(r4)
            java.lang.String r5 = xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean.access$000(r3)
            int r5 = r5.length()
            int r5 = r5 + r4
            r6 = 33
            r0.setSpan(r3, r4, r5, r6)
            int r2 = r2 + 1
            goto L9
        L26:
            return r0
    }
}
