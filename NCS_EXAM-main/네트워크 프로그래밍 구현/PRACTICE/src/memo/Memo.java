package memo;

import java.sql.Timestamp;

/**
 * [PRACTICE] Memo_Tbl 의 한 행을 나타내는 VO — ☆ 학생 구현
 *
 * <pre>
 * 능력단위요소 3 / 수행준거 3.3
 * 체크리스트 3-1 (DAO/VO 캡슐화 — private 필드 + public getter/setter)
 * </pre>
 *
 * <p><b>학생 구현 가이드 (정답 코드 ✗ — 가이드만)</b></p>
 *
 * <p>채울 항목:</p>
 * <ol>
 *   <li>private 필드 4개:
 *       <code>memoId</code>(Integer, PK),
 *       <code>title</code>(String),
 *       <code>content</code>(String),
 *       <code>createdAt</code>(java.sql.Timestamp)</li>
 *   <li>전체 인자 생성자 본문</li>
 *   <li>getter / setter 8개 본문</li>
 *   <li>toString()</li>
 * </ol>
 *
 * <p>💡 Eclipse 단축키 <code>Alt+Shift+S</code> 로 자동 생성 가능.</p>
 * <p>정답은 PRACTICE_답 참고.</p>
 */
public class Memo {

    // TODO: private 필드 4개 선언

    public Memo() {}

    public Memo(Integer memoId, String title, String content, Timestamp createdAt) {
        // TODO: 4개 필드 초기화
    }

    // ====== getter / setter — 학생 TODO ======

    public Integer   getMemoId()                  { return null; /* TODO */ }
    public void      setMemoId(Integer v)         { /* TODO */ }

    public String    getTitle()                   { return null; /* TODO */ }
    public void      setTitle(String v)           { /* TODO */ }

    public String    getContent()                 { return null; /* TODO */ }
    public void      setContent(String v)         { /* TODO */ }

    public Timestamp getCreatedAt()               { return null; /* TODO */ }
    public void      setCreatedAt(Timestamp v)    { /* TODO */ }

    @Override
    public String toString() {
        return "Memo{TODO: 모든 필드 표시}";
    }
}
