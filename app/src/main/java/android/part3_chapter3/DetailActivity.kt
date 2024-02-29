package android.part3_chapter3

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter3.databinding.ActivityDetailBinding
import android.part3_chapter3.model.DetailItem
import android.part3_chapter3.model.Type
import androidx.core.app.ActivityOptionsCompat
import java.util.Calendar

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val adapter = ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

        adapter.submitList(mockData())
    }

    private fun initView() {
        binding.cardTitleTextView.text = intent.getStringExtra(CARD_NAME)
        binding.cardLayout.backgroundTintList =
            intent.getParcelableExtra(CARD_COLOR) as? ColorStateList

        binding.recyclerView.adapter = adapter
    }

    private fun mockData(): List<DetailItem> {
        fun createDate(year: Int, month: Int, day: Int) = Calendar.getInstance().apply {
            set(year, month, day)
        }.time

        val list = mutableListOf<DetailItem>().apply {
            add(
                DetailItem(
                    1,
                    createDate(2023, 1, 6),
                    "A상점",
                    24000,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    2,
                    createDate(2023, 1, 6),
                    "B상점",
                    120210,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    3,
                    createDate(2023, 1, 1),
                    "온라인 마트",
                    11000,
                    Type.CANCEL
                )
            )
            add(
                DetailItem(
                    4,
                    createDate(2023, 1, 1),
                    "온라인 마트",
                    11000,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    5,
                    createDate(2022, 12, 11),
                    "대형 마트",
                    11000,
                    Type.POINT
                )
            )

            add(
                DetailItem(
                    6,
                    createDate(2022, 12, 11),
                    "대형 마트",
                    1100000,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    7,
                    createDate(2022, 11, 10),
                    "창고형 마트",
                    230000,
                    Type.CANCEL
                )
            )

            add(
                DetailItem(
                    8,
                    createDate(2022, 11, 8),
                    "창고형 마트",
                    230000,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    9,
                    createDate(2022, 11, 1),
                    "주유소",
                    50000,
                    Type.PAY
                )
            )

            add(
                DetailItem(
                    10,
                    createDate(2022, 10, 15),
                    "음식점",
                    56000,
                    Type.PAY
                )
            )
        }


        return list
    }


    companion object {
        private const val CARD_NAME = "CARD_NAME"
        private const val CARD_COLOR = "CARD_COLOR"

        fun start(
            context: Context,
            cardName: String,
            cardColor: ColorStateList?,
            optionsCompat: ActivityOptionsCompat
        ) {
            Intent(context, DetailActivity::class.java).apply {
                putExtra(CARD_NAME, cardName)
                putExtra(CARD_COLOR, cardColor)
            }.run {
                context.startActivity(this, optionsCompat.toBundle())
            }
        }
    }
}