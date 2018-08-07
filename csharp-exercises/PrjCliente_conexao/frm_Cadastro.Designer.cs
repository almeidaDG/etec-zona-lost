namespace PrjCliente_conexao
{
    partial class frm_Cadastro
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btn_Incluir = new System.Windows.Forms.Button();
            this.btn_Excluir = new System.Windows.Forms.Button();
            this.btn_Alterar = new System.Windows.Forms.Button();
            this.btn_Limpar = new System.Windows.Forms.Button();
            this.lbl_Matricula = new System.Windows.Forms.Label();
            this.lbl_Nome = new System.Windows.Forms.Label();
            this.lbl_Nasc = new System.Windows.Forms.Label();
            this.lbl_End = new System.Windows.Forms.Label();
            this.txt_Nome = new System.Windows.Forms.TextBox();
            this.txt_End = new System.Windows.Forms.TextBox();
            this.lbl_Numero = new System.Windows.Forms.Label();
            this.lbl_Cep = new System.Windows.Forms.Label();
            this.txt_Numero = new System.Windows.Forms.TextBox();
            this.btn_Anterior = new System.Windows.Forms.Button();
            this.btn_Proximo = new System.Windows.Forms.Button();
            this.btn_Primeiro = new System.Windows.Forms.Button();
            this.btn_Ultimo = new System.Windows.Forms.Button();
            this.msk_cep = new System.Windows.Forms.MaskedTextBox();
            this.dtp_nasc = new System.Windows.Forms.DateTimePicker();
            this.lbl_Pesquisa = new System.Windows.Forms.Label();
            this.txt_Pesquisar = new System.Windows.Forms.TextBox();
            this.lbl_Mtricula2 = new System.Windows.Forms.Label();
            this.dgv_clientes = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dgv_clientes)).BeginInit();
            this.SuspendLayout();
            // 
            // btn_Incluir
            // 
            this.btn_Incluir.Location = new System.Drawing.Point(492, 20);
            this.btn_Incluir.Name = "btn_Incluir";
            this.btn_Incluir.Size = new System.Drawing.Size(75, 23);
            this.btn_Incluir.TabIndex = 0;
            this.btn_Incluir.Text = "Incluir";
            this.btn_Incluir.UseVisualStyleBackColor = true;
            // 
            // btn_Excluir
            // 
            this.btn_Excluir.Location = new System.Drawing.Point(492, 49);
            this.btn_Excluir.Name = "btn_Excluir";
            this.btn_Excluir.Size = new System.Drawing.Size(75, 23);
            this.btn_Excluir.TabIndex = 1;
            this.btn_Excluir.Text = "Excluir";
            this.btn_Excluir.UseVisualStyleBackColor = true;
            // 
            // btn_Alterar
            // 
            this.btn_Alterar.Location = new System.Drawing.Point(492, 78);
            this.btn_Alterar.Name = "btn_Alterar";
            this.btn_Alterar.Size = new System.Drawing.Size(75, 23);
            this.btn_Alterar.TabIndex = 2;
            this.btn_Alterar.Text = "Alterar";
            this.btn_Alterar.UseVisualStyleBackColor = true;
            // 
            // btn_Limpar
            // 
            this.btn_Limpar.Location = new System.Drawing.Point(492, 108);
            this.btn_Limpar.Name = "btn_Limpar";
            this.btn_Limpar.Size = new System.Drawing.Size(75, 23);
            this.btn_Limpar.TabIndex = 3;
            this.btn_Limpar.Text = "Limpar";
            this.btn_Limpar.UseVisualStyleBackColor = true;
            // 
            // lbl_Matricula
            // 
            this.lbl_Matricula.AutoSize = true;
            this.lbl_Matricula.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Matricula.Location = new System.Drawing.Point(98, 20);
            this.lbl_Matricula.Name = "lbl_Matricula";
            this.lbl_Matricula.Size = new System.Drawing.Size(0, 13);
            this.lbl_Matricula.TabIndex = 4;
            // 
            // lbl_Nome
            // 
            this.lbl_Nome.AutoSize = true;
            this.lbl_Nome.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Nome.Location = new System.Drawing.Point(21, 48);
            this.lbl_Nome.Name = "lbl_Nome";
            this.lbl_Nome.Size = new System.Drawing.Size(39, 13);
            this.lbl_Nome.TabIndex = 5;
            this.lbl_Nome.Text = "Nome";
            // 
            // lbl_Nasc
            // 
            this.lbl_Nasc.AutoSize = true;
            this.lbl_Nasc.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Nasc.Location = new System.Drawing.Point(183, 18);
            this.lbl_Nasc.Name = "lbl_Nasc";
            this.lbl_Nasc.Size = new System.Drawing.Size(73, 13);
            this.lbl_Nasc.TabIndex = 6;
            this.lbl_Nasc.Text = "Nascimento";
            // 
            // lbl_End
            // 
            this.lbl_End.AutoSize = true;
            this.lbl_End.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_End.Location = new System.Drawing.Point(21, 92);
            this.lbl_End.Name = "lbl_End";
            this.lbl_End.Size = new System.Drawing.Size(61, 13);
            this.lbl_End.TabIndex = 7;
            this.lbl_End.Text = "Endereça";
            // 
            // txt_Nome
            // 
            this.txt_Nome.Location = new System.Drawing.Point(24, 64);
            this.txt_Nome.Name = "txt_Nome";
            this.txt_Nome.Size = new System.Drawing.Size(308, 20);
            this.txt_Nome.TabIndex = 8;
            // 
            // txt_End
            // 
            this.txt_End.Location = new System.Drawing.Point(24, 108);
            this.txt_End.Name = "txt_End";
            this.txt_End.Size = new System.Drawing.Size(232, 20);
            this.txt_End.TabIndex = 10;
            // 
            // lbl_Numero
            // 
            this.lbl_Numero.AutoSize = true;
            this.lbl_Numero.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Numero.Location = new System.Drawing.Point(21, 131);
            this.lbl_Numero.Name = "lbl_Numero";
            this.lbl_Numero.Size = new System.Drawing.Size(50, 13);
            this.lbl_Numero.TabIndex = 11;
            this.lbl_Numero.Text = "Número";
            // 
            // lbl_Cep
            // 
            this.lbl_Cep.AutoSize = true;
            this.lbl_Cep.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Cep.Location = new System.Drawing.Point(173, 131);
            this.lbl_Cep.Name = "lbl_Cep";
            this.lbl_Cep.Size = new System.Drawing.Size(29, 13);
            this.lbl_Cep.TabIndex = 12;
            this.lbl_Cep.Text = "Cep";
            // 
            // txt_Numero
            // 
            this.txt_Numero.Location = new System.Drawing.Point(77, 131);
            this.txt_Numero.Name = "txt_Numero";
            this.txt_Numero.Size = new System.Drawing.Size(59, 20);
            this.txt_Numero.TabIndex = 13;
            // 
            // btn_Anterior
            // 
            this.btn_Anterior.Location = new System.Drawing.Point(289, 315);
            this.btn_Anterior.Name = "btn_Anterior";
            this.btn_Anterior.Size = new System.Drawing.Size(75, 23);
            this.btn_Anterior.TabIndex = 16;
            this.btn_Anterior.Text = "Anterior";
            this.btn_Anterior.UseVisualStyleBackColor = true;
            // 
            // btn_Proximo
            // 
            this.btn_Proximo.Location = new System.Drawing.Point(208, 315);
            this.btn_Proximo.Name = "btn_Proximo";
            this.btn_Proximo.Size = new System.Drawing.Size(75, 23);
            this.btn_Proximo.TabIndex = 17;
            this.btn_Proximo.Text = "Próximo";
            this.btn_Proximo.UseVisualStyleBackColor = true;
            // 
            // btn_Primeiro
            // 
            this.btn_Primeiro.Location = new System.Drawing.Point(127, 315);
            this.btn_Primeiro.Name = "btn_Primeiro";
            this.btn_Primeiro.Size = new System.Drawing.Size(75, 23);
            this.btn_Primeiro.TabIndex = 18;
            this.btn_Primeiro.Text = "Primeiro";
            this.btn_Primeiro.UseVisualStyleBackColor = true;
            // 
            // btn_Ultimo
            // 
            this.btn_Ultimo.Location = new System.Drawing.Point(370, 315);
            this.btn_Ultimo.Name = "btn_Ultimo";
            this.btn_Ultimo.Size = new System.Drawing.Size(75, 23);
            this.btn_Ultimo.TabIndex = 19;
            this.btn_Ultimo.Text = "Último";
            this.btn_Ultimo.UseVisualStyleBackColor = true;
            // 
            // msk_cep
            // 
            this.msk_cep.Location = new System.Drawing.Point(219, 128);
            this.msk_cep.Mask = "00000-999";
            this.msk_cep.Name = "msk_cep";
            this.msk_cep.Size = new System.Drawing.Size(100, 20);
            this.msk_cep.TabIndex = 21;
            // 
            // dtp_nasc
            // 
            this.dtp_nasc.AllowDrop = true;
            this.dtp_nasc.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dtp_nasc.Location = new System.Drawing.Point(289, 14);
            this.dtp_nasc.Name = "dtp_nasc";
            this.dtp_nasc.Size = new System.Drawing.Size(100, 20);
            this.dtp_nasc.TabIndex = 22;
            // 
            // lbl_Pesquisa
            // 
            this.lbl_Pesquisa.AutoSize = true;
            this.lbl_Pesquisa.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Pesquisa.Location = new System.Drawing.Point(21, 360);
            this.lbl_Pesquisa.Name = "lbl_Pesquisa";
            this.lbl_Pesquisa.Size = new System.Drawing.Size(128, 13);
            this.lbl_Pesquisa.TabIndex = 23;
            this.lbl_Pesquisa.Text = "Pesquisar por Nome::";
            // 
            // txt_Pesquisar
            // 
            this.txt_Pesquisar.Location = new System.Drawing.Point(147, 357);
            this.txt_Pesquisar.Name = "txt_Pesquisar";
            this.txt_Pesquisar.Size = new System.Drawing.Size(297, 20);
            this.txt_Pesquisar.TabIndex = 24;
            this.txt_Pesquisar.TextChanged += new System.EventHandler(this.txt_Pesquisar_TextChanged);
            // 
            // lbl_Mtricula2
            // 
            this.lbl_Mtricula2.AutoSize = true;
            this.lbl_Mtricula2.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Mtricula2.Location = new System.Drawing.Point(25, 20);
            this.lbl_Mtricula2.Name = "lbl_Mtricula2";
            this.lbl_Mtricula2.Size = new System.Drawing.Size(67, 13);
            this.lbl_Mtricula2.TabIndex = 25;
            this.lbl_Mtricula2.Text = "Matricula::";
            // 
            // dgv_clientes
            // 
            this.dgv_clientes.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgv_clientes.Location = new System.Drawing.Point(28, 173);
            this.dgv_clientes.Name = "dgv_clientes";
            this.dgv_clientes.Size = new System.Drawing.Size(539, 126);
            this.dgv_clientes.TabIndex = 20;
            this.dgv_clientes.Click += new System.EventHandler(this.dgv_clientes_Click);
            this.dgv_clientes.KeyUp += new System.Windows.Forms.KeyEventHandler(this.dgv_clientes_KeyUp);
            // 
            // frm_Cadastro
            // 
            this.AllowDrop = true;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(587, 394);
            this.Controls.Add(this.lbl_Mtricula2);
            this.Controls.Add(this.txt_Pesquisar);
            this.Controls.Add(this.lbl_Pesquisa);
            this.Controls.Add(this.dtp_nasc);
            this.Controls.Add(this.msk_cep);
            this.Controls.Add(this.dgv_clientes);
            this.Controls.Add(this.btn_Ultimo);
            this.Controls.Add(this.btn_Primeiro);
            this.Controls.Add(this.btn_Proximo);
            this.Controls.Add(this.btn_Anterior);
            this.Controls.Add(this.txt_Numero);
            this.Controls.Add(this.lbl_Cep);
            this.Controls.Add(this.lbl_Numero);
            this.Controls.Add(this.txt_End);
            this.Controls.Add(this.txt_Nome);
            this.Controls.Add(this.lbl_End);
            this.Controls.Add(this.lbl_Nasc);
            this.Controls.Add(this.lbl_Nome);
            this.Controls.Add(this.lbl_Matricula);
            this.Controls.Add(this.btn_Limpar);
            this.Controls.Add(this.btn_Alterar);
            this.Controls.Add(this.btn_Excluir);
            this.Controls.Add(this.btn_Incluir);
            this.Name = "frm_Cadastro";
            this.Text = "CadastroCliente";
            this.Load += new System.EventHandler(this.frm_Cadastro_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgv_clientes)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btn_Incluir;
        private System.Windows.Forms.Button btn_Excluir;
        private System.Windows.Forms.Button btn_Alterar;
        private System.Windows.Forms.Button btn_Limpar;
        private System.Windows.Forms.Label lbl_Matricula;
        private System.Windows.Forms.Label lbl_Nome;
        private System.Windows.Forms.Label lbl_Nasc;
        private System.Windows.Forms.Label lbl_End;
        private System.Windows.Forms.TextBox txt_Nome;
        private System.Windows.Forms.TextBox txt_End;
        private System.Windows.Forms.Label lbl_Numero;
        private System.Windows.Forms.Label lbl_Cep;
        private System.Windows.Forms.TextBox txt_Numero;
        private System.Windows.Forms.Button btn_Anterior;
        private System.Windows.Forms.Button btn_Proximo;
        private System.Windows.Forms.Button btn_Primeiro;
        private System.Windows.Forms.Button btn_Ultimo;
        private System.Windows.Forms.MaskedTextBox msk_cep;
        private System.Windows.Forms.DateTimePicker dtp_nasc;
        private System.Windows.Forms.Label lbl_Pesquisa;
        private System.Windows.Forms.TextBox txt_Pesquisar;
        private System.Windows.Forms.Label lbl_Mtricula2;
        private System.Windows.Forms.DataGridView dgv_clientes;
    }
}