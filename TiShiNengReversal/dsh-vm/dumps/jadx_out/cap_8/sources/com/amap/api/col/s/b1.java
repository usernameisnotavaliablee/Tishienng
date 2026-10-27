package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b1 {
    public b1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.amap.api.services.auto.AutoTChargeStationResult a(org.json.JSONObject r2) {
            com.amap.api.services.auto.AutoTChargeStationResult r0 = new com.amap.api.services.auto.AutoTChargeStationResult
            r0.<init>()
            java.lang.String r1 = "code"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Exception -> L53
            r0.code = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "message"
            java.lang.String r1 = r2.optString(r1)     // Catch: java.lang.Exception -> L53
            r0.message = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = r2.optJSONObject(r1)     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L53
            java.lang.String r1 = "classify"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Exception -> L53
            com.amap.api.services.auto.Classify r1 = c(r1)     // Catch: java.lang.Exception -> L53
            r0.classify = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "list_data"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Exception -> L53
            com.amap.api.services.auto.ListData r1 = l(r1)     // Catch: java.lang.Exception -> L53
            r0.listData = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "lqii"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Exception -> L53
            com.amap.api.services.auto.Lqii r1 = p(r1)     // Catch: java.lang.Exception -> L53
            r0.lqii = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "meta"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Exception -> L53
            com.amap.api.services.auto.Meta r1 = q(r1)     // Catch: java.lang.Exception -> L53
            r0.meta = r1     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L53
            r0.originJson = r2     // Catch: java.lang.Exception -> L53
        L53:
            return r0
    }

    private static java.util.List<com.amap.api.services.auto.Classify.CheckedNode> b(org.json.JSONArray r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 != 0) goto L8
            goto L39
        L8:
            r1 = 0
            r2 = 0
        La:
            int r3 = r6.length()
            if (r2 >= r3) goto L39
            org.json.JSONObject r3 = r6.optJSONObject(r1)
            if (r3 == 0) goto L36
            com.amap.api.services.auto.Classify$CheckedNode r4 = new com.amap.api.services.auto.Classify$CheckedNode
            r4.<init>()
            java.lang.String r5 = "id"
            java.lang.String r5 = r3.optString(r5)
            r4.id = r5
            java.lang.String r5 = "value"
            java.lang.String r5 = r3.optString(r5)
            r4.value = r5
            java.lang.String r5 = "name"
            java.lang.String r3 = r3.optString(r5)
            r4.name = r3
            r0.add(r4)
        L36:
            int r2 = r2 + 1
            goto La
        L39:
            return r0
    }

    private static com.amap.api.services.auto.Classify c(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Classify r0 = new com.amap.api.services.auto.Classify
            r0.<init>()
            java.lang.String r1 = "item_data"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            com.amap.api.services.auto.Classify$ItermData r1 = e(r1)
            r0.itermData = r1
            java.lang.String r1 = "retain_state"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            com.amap.api.services.auto.Classify$RetainState r2 = k(r2)
            r0.retainState = r2
            return r0
    }

    private static java.util.List<com.amap.api.services.auto.Classify.Data> d(org.json.JSONArray r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 != 0) goto L9
            goto Lab
        L9:
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r9.length()
            if (r2 >= r3) goto Lab
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            if (r3 == 0) goto La7
            com.amap.api.services.auto.Classify$Data r4 = new com.amap.api.services.auto.Classify$Data
            r4.<init>()
            java.lang.String r5 = "category"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r5 == 0) goto L42
            r7 = 0
        L2a:
            int r8 = r5.length()
            if (r7 >= r8) goto L42
            org.json.JSONObject r8 = r5.optJSONObject(r7)
            if (r8 == 0) goto L3f
            com.amap.api.services.auto.Classify$DataCategory r8 = i(r8)
            if (r8 == 0) goto L3f
            r6.add(r8)
        L3f:
            int r7 = r7 + 1
            goto L2a
        L42:
            r4.categories = r6
            java.lang.String r5 = "checked"
            int r5 = r3.optInt(r5)
            r4.checked = r5
            java.lang.String r5 = "classify_item_type"
            java.lang.String r5 = r3.optString(r5)
            r4.classifyItemType = r5
            java.lang.String r5 = "is_cancel_default_select"
            int r5 = r3.optInt(r5)
            r4.isCancelDefaultSelect = r5
            java.lang.String r5 = "is_no_btn"
            int r5 = r3.optInt(r5)
            r4.isNoBtn = r5
            java.lang.String r5 = "name"
            java.lang.String r5 = r3.optString(r5)
            r4.name = r5
            java.lang.String r5 = "params"
            java.lang.String r5 = r3.optString(r5)
            r4.params = r5
            java.lang.String r5 = "separator"
            java.lang.String r5 = r3.optString(r5)
            r4.separator = r5
            java.lang.String r5 = "type"
            java.lang.String r5 = r3.optString(r5)
            r4.type = r5
            java.lang.String r5 = "use_commonly_used_config"
            int r5 = r3.optInt(r5)
            r4.useCommonlyUsedConfig = r5
            java.lang.String r5 = "use_local_config"
            int r5 = r3.optInt(r5)
            r4.useLocalConfig = r5
            java.lang.String r5 = "use_remote_config"
            int r5 = r3.optInt(r5)
            r4.useRemoteConfig = r5
            java.lang.String r5 = "multi_select"
            int r3 = r3.optInt(r5)
            r4.multiSelect = r3
            r0.add(r4)
        La7:
            int r2 = r2 + 1
            goto Lb
        Lab:
            return r0
    }

    private static com.amap.api.services.auto.Classify.ItermData e(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Classify$ItermData r0 = new com.amap.api.services.auto.Classify$ItermData
            r0.<init>()
            java.lang.String r1 = "checked_nodes"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            java.util.List r1 = b(r1)
            r0.checkedNodes = r1
            java.lang.String r1 = "checked_value"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            com.amap.api.services.auto.Classify$CheckedValue r1 = g(r1)
            r0.checkedValue = r1
            java.lang.String r1 = "data"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            java.util.List r1 = d(r1)
            r0.datas = r1
            java.lang.String r1 = "default_position_data"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            java.util.List r1 = d(r1)
            r0.defaultPositionDatas = r1
            java.lang.String r1 = "level2_data"
            org.json.JSONArray r2 = r2.optJSONArray(r1)
            java.util.List r2 = d(r2)
            r0.level2Datas = r2
            return r0
    }

    private static java.util.List<com.amap.api.services.auto.ListData.ChargeInfo> f(org.json.JSONArray r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r11 != 0) goto L8
            goto L70
        L8:
            r1 = 0
            r2 = 0
        La:
            int r3 = r11.length()
            if (r2 >= r3) goto L70
            org.json.JSONObject r3 = r11.optJSONObject(r2)
            if (r3 == 0) goto L6d
            com.amap.api.services.auto.ListData$ChargeInfo r4 = new com.amap.api.services.auto.ListData$ChargeInfo
            r4.<init>()
            java.lang.String r5 = "plugs_info"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            if (r5 == 0) goto L6d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L29:
            int r8 = r5.length()
            if (r7 >= r8) goto L60
            org.json.JSONObject r8 = r5.optJSONObject(r7)
            if (r8 == 0) goto L5d
            com.amap.api.services.auto.ListData$PlugsInfo r9 = new com.amap.api.services.auto.ListData$PlugsInfo
            r9.<init>()
            java.lang.String r10 = "brand_desc"
            java.lang.String r10 = r8.optString(r10)
            r9.brandDesc = r10
            java.lang.String r10 = "fastcur"
            java.lang.String r10 = r8.optString(r10)
            r9.fastcur = r10
            java.lang.String r10 = "fastpower"
            java.lang.String r10 = r8.optString(r10)
            r9.fastpower = r10
            java.lang.String r10 = "fastvol"
            java.lang.String r8 = r8.optString(r10)
            r9.fastvol = r8
            r6.add(r9)
        L5d:
            int r7 = r7 + 1
            goto L29
        L60:
            r4.plugsInfos = r6
            java.lang.String r5 = "plugstype"
            java.lang.String r3 = r3.optString(r5)
            r4.plugsType = r3
            r0.add(r4)
        L6d:
            int r2 = r2 + 1
            goto La
        L70:
            return r0
    }

    private static com.amap.api.services.auto.Classify.CheckedValue g(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Classify$CheckedValue r0 = new com.amap.api.services.auto.Classify$CheckedValue
            r0.<init>()
            java.lang.String r1 = "classify_v2_data"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyV2Data = r1
            java.lang.String r1 = "classify_v2_level2_data"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyV2Level2Data = r1
            java.lang.String r1 = "classify_v2_level3_data"
            java.lang.String r2 = r2.optString(r1)
            r0.classifyV2Level3Data = r2
            return r0
    }

    private static com.amap.api.services.auto.ListData.PriceChargingPark h(org.json.JSONArray r11) {
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            com.amap.api.services.auto.ListData$PriceChargingPark r0 = new com.amap.api.services.auto.ListData$PriceChargingPark
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L10:
            int r4 = r11.length()
            if (r3 >= r4) goto L76
            org.json.JSONObject r4 = r11.optJSONObject(r3)
            if (r4 == 0) goto L73
            com.amap.api.services.auto.ListData$Park r5 = new com.amap.api.services.auto.ListData$Park
            r5.<init>()
            java.lang.String r6 = "src_type"
            java.lang.String r6 = r4.optString(r6)
            r5.srcType = r6
            java.lang.String r6 = "price_charging"
            org.json.JSONArray r4 = r4.optJSONArray(r6)
            if (r4 == 0) goto L70
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L37:
            int r8 = r4.length()
            if (r7 >= r8) goto L6e
            org.json.JSONObject r8 = r4.optJSONObject(r7)
            if (r8 == 0) goto L6b
            com.amap.api.services.auto.ListData$PriceCharging r9 = new com.amap.api.services.auto.ListData$PriceCharging
            r9.<init>()
            java.lang.String r10 = "ele_price"
            java.lang.String r10 = r8.optString(r10)
            r9.elePrice = r10
            java.lang.String r10 = "ser_price"
            java.lang.String r10 = r8.optString(r10)
            r9.serPrice = r10
            java.lang.String r10 = "time"
            java.lang.String r10 = r8.optString(r10)
            r9.time = r10
            java.lang.String r10 = "updatetime"
            int r8 = r8.optInt(r10)
            r9.updatetime = r8
            r6.add(r9)
        L6b:
            int r7 = r7 + 1
            goto L37
        L6e:
            r5.priceChargings = r6
        L70:
            r1.add(r5)
        L73:
            int r3 = r3 + 1
            goto L10
        L76:
            r0.parks = r1
            return r0
    }

    private static com.amap.api.services.auto.Classify.DataCategory i(org.json.JSONObject r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            com.amap.api.services.auto.Classify$DataCategory r0 = new com.amap.api.services.auto.Classify$DataCategory
            r0.<init>()
            java.lang.String r1 = "category"
            org.json.JSONArray r1 = r5.optJSONArray(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L2f
            r3 = 0
        L17:
            int r4 = r1.length()
            if (r3 >= r4) goto L2f
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 == 0) goto L2c
            com.amap.api.services.auto.Classify$Category r4 = j(r4)
            if (r4 == 0) goto L2c
            r2.add(r4)
        L2c:
            int r3 = r3 + 1
            goto L17
        L2f:
            r0.categories = r2
            java.lang.String r1 = "checked"
            int r1 = r5.optInt(r1)
            r0.checked = r1
            java.lang.String r1 = "default"
            int r1 = r5.optInt(r1)
            r0.defaultValue = r1
            java.lang.String r1 = "component_type"
            java.lang.String r1 = r5.optString(r1)
            r0.componentType = r1
            java.lang.String r1 = "name"
            java.lang.String r1 = r5.optString(r1)
            r0.name = r1
            java.lang.String r1 = "params"
            java.lang.String r1 = r5.optString(r1)
            r0.params = r1
            java.lang.String r1 = "area_subway_mark"
            int r1 = r5.optInt(r1)
            r0.areaSubwayMark = r1
            java.lang.String r1 = "hide_title"
            int r1 = r5.optInt(r1)
            r0.hideTitle = r1
            java.lang.String r1 = "max_show_num"
            int r1 = r5.optInt(r1)
            r0.maxShowNum = r1
            java.lang.String r1 = "max_show_num_row"
            int r1 = r5.optInt(r1)
            r0.maxShowNumRow = r1
            java.lang.String r1 = "multi_select"
            int r1 = r5.optInt(r1)
            r0.multiSelect = r1
            java.lang.String r1 = "img"
            java.lang.String r1 = r5.optString(r1)
            r0.img = r1
            java.lang.String r1 = "show_type"
            java.lang.String r1 = r5.optString(r1)
            r0.showType = r1
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.optString(r1)
            r0.value = r1
            java.lang.String r1 = "classify_item_type"
            java.lang.String r5 = r5.optString(r1)
            r0.classifyItemType = r5
            return r0
    }

    private static com.amap.api.services.auto.Classify.Category j(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Classify$Category r0 = new com.amap.api.services.auto.Classify$Category
            r0.<init>()
            java.lang.String r1 = "checked"
            int r1 = r2.optInt(r1)
            r0.checked = r1
            java.lang.String r1 = "component_type"
            java.lang.String r1 = r2.optString(r1)
            r0.componentType = r1
            java.lang.String r1 = "default"
            int r1 = r2.optInt(r1)
            r0.defaultValue = r1
            java.lang.String r1 = "name"
            java.lang.String r1 = r2.optString(r1)
            r0.name = r1
            java.lang.String r1 = "value"
            java.lang.String r1 = r2.optString(r1)
            r0.value = r1
            java.lang.String r1 = "classify_item_type"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyItemType = r1
            java.lang.String r1 = "img"
            java.lang.String r1 = r2.optString(r1)
            r0.img = r1
            java.lang.String r1 = "show_type"
            java.lang.String r1 = r2.optString(r1)
            r0.showType = r1
            java.lang.String r1 = "params"
            java.lang.String r2 = r2.optString(r1)
            r0.params = r2
            return r0
    }

    private static com.amap.api.services.auto.Classify.RetainState k(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Classify$RetainState r0 = new com.amap.api.services.auto.Classify$RetainState
            r0.<init>()
            java.lang.String r1 = "classify_business_type"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyBusinessType = r1
            java.lang.String r1 = "classify_conf"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyConf = r1
            java.lang.String r1 = "classify_retain_level2"
            java.lang.String r1 = r2.optString(r1)
            r0.classifyRetainLevel2 = r1
            java.lang.String r1 = "level2_all"
            java.lang.String r1 = r2.optString(r1)
            r0.level2All = r1
            java.lang.String r1 = "new_classify_cityadcode"
            java.lang.String r1 = r2.optString(r1)
            r0.newClassifyCityadcode = r1
            java.lang.String r1 = "new_classify_flag"
            java.lang.String r2 = r2.optString(r1)
            r0.newClassifyFlag = r2
            return r0
    }

    private static com.amap.api.services.auto.ListData l(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.amap.api.services.auto.ListData r0 = new com.amap.api.services.auto.ListData
            r0.<init>()
            java.lang.String r1 = "content"
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L15:
            int r3 = r4.length()
            if (r2 >= r3) goto L2d
            org.json.JSONObject r3 = r4.optJSONObject(r2)
            if (r3 == 0) goto L2a
            com.amap.api.services.auto.ListData$Content r3 = m(r3)
            if (r3 == 0) goto L2a
            r1.add(r3)
        L2a:
            int r2 = r2 + 1
            goto L15
        L2d:
            r0.content = r1
            return r0
    }

    private static com.amap.api.services.auto.ListData.Content m(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.amap.api.services.auto.ListData$Content r0 = new com.amap.api.services.auto.ListData$Content
            r0.<init>()
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L30
            com.amap.api.services.auto.ListData$Data r2 = new com.amap.api.services.auto.ListData$Data
            r2.<init>()
            java.lang.String r3 = "basic_info"
            org.json.JSONObject r3 = r1.optJSONObject(r3)
            com.amap.api.services.auto.ListData$BasicInfo r3 = n(r3)
            r2.basicInfo = r3
            java.lang.String r3 = "charging_info"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            com.amap.api.services.auto.ListData$ChargingInfo r1 = o(r1)
            r2.chargingInfo = r1
            r0.data = r2
        L30:
            java.lang.String r1 = "item_type"
            java.lang.String r4 = r4.optString(r1)
            r0.itemType = r4
            return r0
    }

    private static com.amap.api.services.auto.ListData.BasicInfo n(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.amap.api.services.auto.ListData$BasicInfo r0 = new com.amap.api.services.auto.ListData$BasicInfo
            r0.<init>()
            java.lang.String r1 = "adcode"
            java.lang.String r1 = r4.optString(r1)
            r0.adcode = r1
            java.lang.String r1 = "address"
            java.lang.String r1 = r4.optString(r1)
            r0.address = r1
            java.lang.String r1 = "averagecost"
            java.lang.String r1 = r4.optString(r1)
            r0.averagecost = r1
            java.lang.String r1 = "building_status"
            java.lang.String r1 = r4.optString(r1)
            r0.buildingStatus = r1
            java.lang.String r1 = "business_area"
            java.lang.String r1 = r4.optString(r1)
            r0.businessArea = r1
            java.lang.String r1 = "child_shortname"
            java.lang.String r1 = r4.optString(r1)
            r0.childShortname = r1
            java.lang.String r1 = "child_shortname_en"
            java.lang.String r1 = r4.optString(r1)
            r0.childShortnameEn = r1
            java.lang.String r1 = "childtype"
            java.lang.String r1 = r4.optString(r1)
            r0.childtype = r1
            java.lang.String r1 = "citycode"
            java.lang.String r1 = r4.optString(r1)
            r0.citycode = r1
            java.lang.String r1 = "cname"
            java.lang.String r1 = r4.optString(r1)
            r0.cname = r1
            java.lang.String r1 = "disp_name"
            java.lang.String r1 = r4.optString(r1)
            r0.dispName = r1
            java.lang.String r1 = "distance"
            java.lang.String r1 = r4.optString(r1)
            r0.distance = r1
            java.lang.String r1 = "dname"
            java.lang.String r1 = r4.optString(r1)
            r0.dname = r1
            java.lang.String r1 = "eaddress"
            java.lang.String r1 = r4.optString(r1)
            r0.eaddress = r1
            java.lang.String r1 = "end_poi_extension"
            java.lang.String r1 = r4.optString(r1)
            r0.endPoiExtension = r1
            java.lang.String r1 = "f_nona"
            java.lang.String r1 = r4.optString(r1)
            r0.fNona = r1
            java.lang.String r1 = "his_mark"
            java.lang.String r1 = r4.optString(r1)
            r0.hisMark = r1
            java.lang.String r1 = "hot_text"
            java.lang.String r1 = r4.optString(r1)
            r0.hotText = r1
            java.lang.String r1 = "id"
            java.lang.String r1 = r4.optString(r1)
            r0.id = r1
            java.lang.String r1 = "industry"
            java.lang.String r1 = r4.optString(r1)
            r0.industry = r1
            java.lang.String r1 = "latitude"
            java.lang.String r1 = r4.optString(r1)
            r0.latitude = r1
            java.lang.String r1 = "longitude"
            java.lang.String r1 = r4.optString(r1)
            r0.longitude = r1
            java.lang.String r1 = "name"
            java.lang.String r1 = r4.optString(r1)
            r0.name = r1
            java.lang.String r1 = "category"
            java.lang.String r1 = r4.optString(r1)
            r0.category = r1
            com.amap.api.services.auto.ListData$NaviVisited r1 = new com.amap.api.services.auto.ListData$NaviVisited
            r1.<init>()
            java.lang.String r2 = "navi_visited"
            org.json.JSONObject r2 = r4.optJSONObject(r2)
            if (r2 == 0) goto Lde
            java.lang.String r3 = "rand_union_month_uv"
            java.lang.String r2 = r2.optString(r3)
            r1.randUnionMonthUv = r2
        Lde:
            r0.naviVisited = r1
            java.lang.String r1 = "num_space_w"
            java.lang.String r1 = r4.optString(r1)
            r0.numSpaceW = r1
            java.lang.String r1 = "num_space_w_f"
            java.lang.String r1 = r4.optString(r1)
            r0.numSpaceWF = r1
            java.lang.String r1 = "opentime2"
            java.lang.String r1 = r4.optString(r1)
            r0.opentime2 = r1
            java.lang.String r1 = "opentime_text"
            java.lang.String r1 = r4.optString(r1)
            r0.opentimeText = r1
            java.lang.String r1 = "parent"
            java.lang.String r1 = r4.optString(r1)
            r0.parent = r1
            java.lang.String r1 = "parent_name"
            java.lang.String r1 = r4.optString(r1)
            r0.parentName = r1
            java.lang.String r1 = "pic_info"
            java.lang.String r1 = r4.optString(r1)
            r0.picInfo = r1
            java.lang.String r1 = "rating"
            java.lang.String r1 = r4.optString(r1)
            r0.rating = r1
            java.lang.String r1 = "recommend_flag"
            java.lang.String r1 = r4.optString(r1)
            r0.recommendFlag = r1
            java.lang.String r1 = "review_total"
            java.lang.String r1 = r4.optString(r1)
            r0.reviewTotal = r1
            java.lang.String r1 = "sell"
            java.lang.String r1 = r4.optString(r1)
            r0.sell = r1
            com.amap.api.services.auto.ListData$ShortReview r1 = new com.amap.api.services.auto.ListData$ShortReview
            r1.<init>()
            java.lang.String r2 = "short_review"
            org.json.JSONObject r2 = r4.optJSONObject(r2)
            if (r2 == 0) goto L147
            r0.shortReview = r1
        L147:
            java.lang.String r1 = "tel"
            java.lang.String r1 = r4.optString(r1)
            r0.tel = r1
            java.lang.String r1 = "towards_angle"
            java.lang.String r1 = r4.optString(r1)
            r0.towardsAngle = r1
            java.lang.String r1 = "typecode"
            java.lang.String r1 = r4.optString(r1)
            r0.typeCode = r1
            java.lang.String r1 = "update_flag"
            java.lang.String r1 = r4.optString(r1)
            r0.updateFlag = r1
            java.lang.String r1 = "x_entr"
            java.lang.String r1 = r4.optString(r1)
            r0.xEntr = r1
            java.lang.String r1 = "y_entr"
            java.lang.String r4 = r4.optString(r1)
            r0.yEntr = r4
            return r0
    }

    private static com.amap.api.services.auto.ListData.ChargingInfo o(org.json.JSONObject r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            com.amap.api.services.auto.ListData$ChargingInfo r0 = new com.amap.api.services.auto.ListData$ChargingInfo
            r0.<init>()
            java.lang.String r1 = "brand_desc"
            java.lang.String r1 = r5.optString(r1)
            r0.brandDesc = r1
            java.lang.String r1 = "charge_info"
            org.json.JSONArray r1 = r5.optJSONArray(r1)
            java.util.List r1 = f(r1)
            r0.chargeInfo = r1
            java.lang.String r1 = "charging_rating_flag_term"
            java.lang.String r1 = r5.optString(r1)
            r0.chargingRatingFlagTerm = r1
            java.lang.String r1 = "credit_zhima"
            java.lang.String r1 = r5.optString(r1)
            r0.creditZhima = r1
            java.lang.String r1 = "cscf"
            java.lang.String r1 = r5.optString(r1)
            r0.cscf = r1
            java.lang.String r1 = "current_ele_price"
            java.lang.String r1 = r5.optString(r1)
            r0.currentElePrice = r1
            java.lang.String r1 = "current_ser_price"
            java.lang.String r1 = r5.optString(r1)
            r0.currentSerPrice = r1
            java.lang.String r1 = "deep_rights_tag"
            java.lang.String r1 = r5.optString(r1)
            r0.deepRightsTag = r1
            java.lang.String r1 = "latest_charge"
            java.lang.String r1 = r5.optString(r1)
            r0.latestCharge = r1
            java.lang.String r1 = "num_fast"
            java.lang.String r1 = r5.optString(r1)
            r0.numFast = r1
            java.lang.String r1 = "num_slow"
            java.lang.String r1 = r5.optString(r1)
            r0.numSlow = r1
            java.lang.String r1 = "park_category"
            java.lang.String r1 = r5.optString(r1)
            r0.parkCategory = r1
            java.lang.String r1 = "price_charging_pack"
            org.json.JSONArray r1 = r5.optJSONArray(r1)
            com.amap.api.services.auto.ListData$PriceChargingPark r1 = h(r1)
            r0.priceChargingPark = r1
            java.lang.String r1 = "price_parking_std"
            java.lang.String r1 = r5.optString(r1)
            r0.priceParkingStd = r1
            java.lang.String r1 = "iddictionary"
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            if (r5 == 0) goto La8
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r5.keys()
        L92:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r5.optString(r3)
            r1.put(r3, r4)
            goto L92
        La6:
            r0.idDictionary = r1
        La8:
            return r0
    }

    private static com.amap.api.services.auto.Lqii p(org.json.JSONObject r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.amap.api.services.auto.Lqii r0 = new com.amap.api.services.auto.Lqii
            r0.<init>()
            java.lang.String r1 = "category_brand_recognition_result"
            java.lang.String r1 = r3.optString(r1)
            r0.categoryBrandRecognitionResult = r1
            java.lang.String r1 = "change_query_tip"
            java.lang.String r2 = r3.optString(r1)
            r0.changeQueryTip = r2
            java.lang.String r1 = r3.optString(r1)
            r0.expandRangeTip = r1
            java.lang.String r1 = "is_current_city"
            java.lang.String r1 = r3.optString(r1)
            r0.isCurrentCity = r1
            java.lang.String r1 = "is_user_city"
            java.lang.String r1 = r3.optString(r1)
            r0.isUserCity = r1
            java.lang.String r1 = "query_cate_result"
            java.lang.String r1 = r3.optString(r1)
            r0.queryCateResult = r1
            java.lang.String r1 = "suggestcontent"
            java.lang.String r1 = r3.optString(r1)
            r0.suggestContent = r1
            java.lang.String r1 = "target_view_city"
            java.lang.String r1 = r3.optString(r1)
            r0.targetViewCity = r1
            java.lang.String r1 = "totalhits"
            java.lang.String r1 = r3.optString(r1)
            r0.totalhits = r1
            java.lang.String r1 = "view_region"
            java.lang.String r3 = r3.optString(r1)
            r0.viewRegion = r3
            return r0
    }

    private static com.amap.api.services.auto.Meta q(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.auto.Meta r0 = new com.amap.api.services.auto.Meta
            r0.<init>()
            java.lang.String r1 = "list_biz_type"
            java.lang.String r2 = r2.optString(r1)
            r0.listBizType = r2
            return r0
    }
}
