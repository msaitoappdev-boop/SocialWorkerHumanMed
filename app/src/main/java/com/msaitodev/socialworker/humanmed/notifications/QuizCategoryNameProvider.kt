package com.msaitodev.socialworker.humanmed.notifications

import android.content.Context
import com.msaitodev.socialworker.humanmed.R
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * クイズアプリ向けのカテゴリ名称供給実装。
 * ディレクトリ名（ID）を、Hub層の strings.xml に定義された日本語名に変換します。
 */
@Singleton
class QuizCategoryNameProvider @Inject constructor(
    @ApplicationContext private val context: Context
) : CategoryNameProvider {
    override fun getDisplayName(categoryId: String): String {
        val resId = when (categoryId) {
            "01_society" -> R.string.cat_01_society
            "02_system" -> R.string.cat_02_system
            "03_method" -> R.string.cat_03_method
            "04_service" -> R.string.cat_04_service
            "05_comprehensive" -> R.string.cat_05_comprehensive
            "unclassified" -> R.string.cat_unclassified
            else -> null
        }
        
        return if (resId != null) {
            context.getString(resId)
        } else {
            // マッピングがない場合は ID をそのまま返し、不備に気づきやすくする
            categoryId
        }
    }
}
