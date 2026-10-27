package xyz.adscope.common.v2.tool.str;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RegexUtil {
    public static final java.lang.String REGEX_API_KEY = "[\\W\\s]+";
    private static final java.lang.String REGEX_MACROS = "__[A-Z_^\\d]+__";
    public static final java.lang.String REGEX_RGB = "#[a-fA-F\\d]{6}";
    public static final java.lang.String REGEX_RGBA = "#[a-fA-F\\d]{8}";

    private RegexUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean match(java.lang.String r0, java.lang.String r1) {
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            return r0
    }

    public static java.lang.String replaceAllChar(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L13
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            java.lang.String r1 = r1.replaceAll(r3)
            return r1
        L13:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String replaceMacros(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            java.lang.String r0 = "~"
            java.lang.String r1 = "_"
            if (r8 == 0) goto L6a
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L6a
            java.lang.String r2 = "__[A-Z_^\\d]+__"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r3 = r2.matcher(r7)
        L16:
            boolean r4 = r3.find()
            if (r4 == 0) goto L6a
            java.lang.String r7 = r3.group()
            boolean r4 = r8.containsKey(r7)
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r8.get(r7)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L5d
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = "\\\\\""
            if (r7 == 0) goto L48
            java.lang.String r5 = "\""
            boolean r6 = r7.contains(r5)
            if (r6 == 0) goto L48
            java.lang.String r7 = r7.replaceAll(r5, r4)
        L48:
            java.lang.String r7 = java.util.regex.Matcher.quoteReplacement(r7)
            java.lang.String r5 = "\\\""
            boolean r6 = r7.contains(r5)
            if (r6 == 0) goto L58
            java.lang.String r7 = r7.replaceAll(r5, r4)
        L58:
            java.lang.String r7 = r3.replaceFirst(r7)
            goto L65
        L5d:
            java.lang.String r7 = r7.replace(r1, r0)
            java.lang.String r7 = r3.replaceFirst(r7)
        L65:
            java.util.regex.Matcher r3 = r2.matcher(r7)
            goto L16
        L6a:
            java.lang.String r7 = r7.replace(r0, r1)
            return r7
    }
}
