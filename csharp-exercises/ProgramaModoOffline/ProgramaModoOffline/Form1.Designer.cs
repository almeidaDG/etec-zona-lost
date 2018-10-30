namespace ProgramaModoOffline
{
    partial class Form1
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
            this.lblNome = new System.Windows.Forms.Label();
            this.lblFuncionarios = new System.Windows.Forms.Label();
            this.txbFuncionario = new System.Windows.Forms.TextBox();
            this.dgvBanco = new System.Windows.Forms.DataGridView();
            this.btnSalvar = new System.Windows.Forms.Button();
            this.btnEnviar = new System.Windows.Forms.Button();
            this.lblCargo = new System.Windows.Forms.Label();
            this.lblSalario = new System.Windows.Forms.Label();
            this.lblData = new System.Windows.Forms.Label();
            this.txbCargo = new System.Windows.Forms.TextBox();
            this.txbSalario = new System.Windows.Forms.TextBox();
            this.txbData = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.dgvBanco)).BeginInit();
            this.SuspendLayout();
            // 
            // lblNome
            // 
            this.lblNome.AutoSize = true;
            this.lblNome.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNome.Location = new System.Drawing.Point(31, 41);
            this.lblNome.Name = "lblNome";
            this.lblNome.Size = new System.Drawing.Size(55, 20);
            this.lblNome.TabIndex = 0;
            this.lblNome.Text = "Nome:";
            // 
            // lblFuncionarios
            // 
            this.lblFuncionarios.AutoSize = true;
            this.lblFuncionarios.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblFuncionarios.Location = new System.Drawing.Point(30, 242);
            this.lblFuncionarios.Name = "lblFuncionarios";
            this.lblFuncionarios.Size = new System.Drawing.Size(377, 20);
            this.lblFuncionarios.TabIndex = 1;
            this.lblFuncionarios.Text = "Funcionários PENDENTES p/ envio banco de dados";
            // 
            // txbFuncionario
            // 
            this.txbFuncionario.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txbFuncionario.Location = new System.Drawing.Point(92, 38);
            this.txbFuncionario.Name = "txbFuncionario";
            this.txbFuncionario.Size = new System.Drawing.Size(306, 26);
            this.txbFuncionario.TabIndex = 2;
            // 
            // dgvBanco
            // 
            this.dgvBanco.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvBanco.Location = new System.Drawing.Point(34, 278);
            this.dgvBanco.Name = "dgvBanco";
            this.dgvBanco.Size = new System.Drawing.Size(373, 159);
            this.dgvBanco.TabIndex = 3;
            // 
            // btnSalvar
            // 
            this.btnSalvar.Location = new System.Drawing.Point(35, 601);
            this.btnSalvar.Name = "btnSalvar";
            this.btnSalvar.Size = new System.Drawing.Size(151, 38);
            this.btnSalvar.TabIndex = 4;
            this.btnSalvar.Text = "Salvar Offline";
            this.btnSalvar.UseVisualStyleBackColor = true;
            this.btnSalvar.Click += new System.EventHandler(this.btnSalvar_Click);
            // 
            // btnEnviar
            // 
            this.btnEnviar.Location = new System.Drawing.Point(191, 601);
            this.btnEnviar.Name = "btnEnviar";
            this.btnEnviar.Size = new System.Drawing.Size(216, 38);
            this.btnEnviar.TabIndex = 5;
            this.btnEnviar.Text = "Enviar PENDÊNCIAS ao Banco de Dados.";
            this.btnEnviar.UseVisualStyleBackColor = true;
            this.btnEnviar.Click += new System.EventHandler(this.btnEnviar_Click);
            // 
            // lblCargo
            // 
            this.lblCargo.AutoSize = true;
            this.lblCargo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCargo.Location = new System.Drawing.Point(30, 92);
            this.lblCargo.Name = "lblCargo";
            this.lblCargo.Size = new System.Drawing.Size(56, 20);
            this.lblCargo.TabIndex = 6;
            this.lblCargo.Text = "Cargo:";
            // 
            // lblSalario
            // 
            this.lblSalario.AutoSize = true;
            this.lblSalario.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSalario.Location = new System.Drawing.Point(30, 140);
            this.lblSalario.Name = "lblSalario";
            this.lblSalario.Size = new System.Drawing.Size(62, 20);
            this.lblSalario.TabIndex = 7;
            this.lblSalario.Text = "Salário:";
            // 
            // lblData
            // 
            this.lblData.AutoSize = true;
            this.lblData.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblData.Location = new System.Drawing.Point(30, 184);
            this.lblData.Name = "lblData";
            this.lblData.Size = new System.Drawing.Size(131, 20);
            this.lblData.TabIndex = 8;
            this.lblData.Text = "Data da Entrada:";
            // 
            // txbCargo
            // 
            this.txbCargo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txbCargo.Location = new System.Drawing.Point(92, 89);
            this.txbCargo.Name = "txbCargo";
            this.txbCargo.Size = new System.Drawing.Size(207, 26);
            this.txbCargo.TabIndex = 9;
            // 
            // txbSalario
            // 
            this.txbSalario.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txbSalario.Location = new System.Drawing.Point(92, 137);
            this.txbSalario.Name = "txbSalario";
            this.txbSalario.Size = new System.Drawing.Size(155, 26);
            this.txbSalario.TabIndex = 10;
            // 
            // txbData
            // 
            this.txbData.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txbData.Location = new System.Drawing.Point(167, 181);
            this.txbData.Name = "txbData";
            this.txbData.Size = new System.Drawing.Size(154, 26);
            this.txbData.TabIndex = 11;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(441, 651);
            this.Controls.Add(this.txbData);
            this.Controls.Add(this.txbSalario);
            this.Controls.Add(this.txbCargo);
            this.Controls.Add(this.lblData);
            this.Controls.Add(this.lblSalario);
            this.Controls.Add(this.lblCargo);
            this.Controls.Add(this.btnEnviar);
            this.Controls.Add(this.btnSalvar);
            this.Controls.Add(this.dgvBanco);
            this.Controls.Add(this.txbFuncionario);
            this.Controls.Add(this.lblFuncionarios);
            this.Controls.Add(this.lblNome);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.dgvBanco)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblNome;
        private System.Windows.Forms.Label lblFuncionarios;
        private System.Windows.Forms.TextBox txbFuncionario;
        private System.Windows.Forms.DataGridView dgvBanco;
        private System.Windows.Forms.Button btnSalvar;
        private System.Windows.Forms.Button btnEnviar;
        private System.Windows.Forms.Label lblCargo;
        private System.Windows.Forms.Label lblSalario;
        private System.Windows.Forms.Label lblData;
        private System.Windows.Forms.TextBox txbCargo;
        private System.Windows.Forms.TextBox txbSalario;
        private System.Windows.Forms.TextBox txbData;
    }
}

