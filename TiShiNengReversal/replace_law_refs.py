import re

# L1~L10 映射
LAW_MAP = {
    "L1": "《中华人民共和国个人信息保护法》",
    "L2": "《App违法违规收集使用个人信息行为认定方法》",
    "L3": "《常见类型移动互联网应用程序必要个人信息范围规定》",
    "L4": "《网络数据安全管理条例》",
    "L5": "《人脸识别技术应用安全管理办法》",
    "L6": "《最高人民法院关于审理使用人脸识别技术处理个人信息相关民事案件适用法律若干问题的规定》",
    "L7": "《互联网广告管理办法》",
    "L8": "《中华人民共和国数据安全法》",
    "L9": "《规范互联网信息服务市场秩序若干规定》",
    "L10": "《移动互联网应用程序信息服务管理规定》",
}

with open(r"C:\Users\Administrator\Downloads\tishineng.apk\体适能_新增不合规点与法条标注补充.md", "r", encoding="utf-8") as f:
    content = f.read()

lines = content.split("\n")
result = []
in_index_table = False
table_ended = False

for i, line in enumerate(lines):
    # 检测法规索引表开始
    if not table_ended and "| 编号 |" in line and "规范" in line:
        in_index_table = True

    # 法规索引表内：原样保留
    if in_index_table:
        result.append(line)
        # 索引表结束后（空行）
        if line.strip() == "" and in_index_table and i > 10:
            in_index_table = False
            table_ended = True
        continue

    # 正文区域：替换
    new_line = line

    # 规则1：Lx《法条名》→ 用 LAW_MAP 中的正式名称替换整个 Lx《法条名》
    # 例如 "L1《个人信息保护法》" → "《中华人民共和国个人信息保护法》"
    # 例如 "L2《认定方法》" → "《App违法违规收集使用个人信息行为认定方法》"
    for code in sorted(LAW_MAP.keys(), key=len, reverse=True):
        full_name = LAW_MAP[code]
        new_line = re.sub(
            re.escape(code) + r'《[^》]+》',
            full_name,
            new_line
        )

    # 规则2：Lx 第 → 插入完整法条名
    # 例如 "L1 第 17 条" → "《中华人民共和国个人信息保护法》第 17 条"
    for code in sorted(LAW_MAP.keys(), key=len, reverse=True):
        full_name = LAW_MAP[code]
        new_line = re.sub(
            re.escape(code) + r'(?=\s*第)',
            full_name,
            new_line
        )

    # 规则3：Lx + 中文数字编号（L2 的认定方法内部编号）
    # 例如 "L2 二.1" → "《App违法违规收集使用个人信息行为认定方法》二.1"
    # 例如 "L2 二/三/四/五" → "《App违法违规收集使用个人信息行为认定方法》二/三/四/五"
    for code in sorted(LAW_MAP.keys(), key=len, reverse=True):
        full_name = LAW_MAP[code]
        new_line = re.sub(
            re.escape(code) + r'(?=\s*[一二三四五六七八九十]+[./])',
            full_name,
            new_line
        )

    result.append(new_line)

output_path = r"D:\ClaudeCode\tishineng_docx\体适能_新增不合规点与法条标注补充_替换后.md"
with open(output_path, "w", encoding="utf-8") as f:
    f.write("\n".join(result))

print(f"完成，输出到 {output_path}")
